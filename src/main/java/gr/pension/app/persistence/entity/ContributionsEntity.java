package gr.pension.app.persistence.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contributions", schema = "mydb", catalog = "")
public class ContributionsEntity {
    private Integer id;
    private String amount;
    private HistoryworkingEntity historyworkingByHistoryworkingid;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amount", nullable = true, length = 45)
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContributionsEntity that = (ContributionsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount);
    }

    @ManyToOne
    @JoinColumn(name = "historyworkingid", referencedColumnName = "id", nullable = false)
    public HistoryworkingEntity getHistoryworkingByHistoryworkingid() {
        return historyworkingByHistoryworkingid;
    }

    public void setHistoryworkingByHistoryworkingid(HistoryworkingEntity historyworkingByHistoryworkingid) {
        this.historyworkingByHistoryworkingid = historyworkingByHistoryworkingid;
    }
}

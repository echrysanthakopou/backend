package gr.pension.app.model.entitiesNew;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contributions", schema = "mydb", catalog = "")
@IdClass(ContributionsEntityPK.class)
public class ContributionsEntity {
    private Integer id;
    private String amount;
    private Integer historyWorkingId;

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

    @Id
    @Column(name = "historyWorking_id", nullable = false)
    public Integer getHistoryWorkingId() {
        return historyWorkingId;
    }

    public void setHistoryWorkingId(Integer historyWorkingId) {
        this.historyWorkingId = historyWorkingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContributionsEntity that = (ContributionsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(historyWorkingId, that.historyWorkingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, historyWorkingId);
    }
}

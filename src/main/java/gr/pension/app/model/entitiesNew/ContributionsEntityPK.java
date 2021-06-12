package gr.pension.app.model.entitiesNew;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ContributionsEntityPK implements Serializable {
    private Integer id;
    private Integer historyWorkingId;

    @Column(name = "id", nullable = false)
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "historyWorking_id", nullable = false)
    @Id
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
        ContributionsEntityPK that = (ContributionsEntityPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(historyWorkingId, that.historyWorkingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, historyWorkingId);
    }
}

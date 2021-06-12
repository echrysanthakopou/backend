package gr.pension.app.model.entitiesNew;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "historyworking", schema = "mydb", catalog = "")
public class HistoryworkingEntity {
    private Integer id;
    private Date startdate;
    private Date todate;
    private Double salary;
    private CompanyEntity companyByCompanyId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "startdate", nullable = true)
    public Date getStartDate() {
        return startdate;
    }

    public void setStartDate(Date startDate) {
        this.startdate = startDate;
    }

    @Basic
    @Column(name = "toDate", nullable = true)
    public Date getToDate() {
        return todate;
    }

    public void setToDate(Date toDate) {
        this.todate = toDate;
    }

    @Basic
    @Column(name = "salary", nullable = true, precision = 0)
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryworkingEntity that = (HistoryworkingEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(startdate, that.startdate) &&
                Objects.equals(todate, that.todate) &&
                Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startdate, todate, salary);
    }

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    public CompanyEntity getCompanyByCompanyId() {
        return companyByCompanyId;
    }

    public void setCompanyByCompanyId(CompanyEntity companyByCompanyId) {
        this.companyByCompanyId = companyByCompanyId;
    }
}

package gr.pension.app.model.entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@EnableAutoConfiguration
@Table(name = "historyworking", schema = "mydb", catalog = "")
public class HistoryworkingEntity {
    private Integer id;
    private Date startdate;
    private Date todate;
    private Double salary;
    private Collection<ContributionsEntity> contributionsById;
    private UserEntity userByUserid;
    private CompanyEntity companyByCompanyid;

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
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "todate", nullable = true)
    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
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

    @OneToMany(mappedBy = "historyworkingByHistoryworkingid")
    public Collection<ContributionsEntity> getContributionsById() {
        return contributionsById;
    }

    public void setContributionsById(Collection<ContributionsEntity> contributionsById) {
        this.contributionsById = contributionsById;
    }

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    public UserEntity getUserByUserid() {
        return userByUserid;
    }

    public void setUserByUserid(UserEntity userByUserid) {
        this.userByUserid = userByUserid;
    }

    @ManyToOne
    @JoinColumn(name = "companyid", referencedColumnName = "id")
    public CompanyEntity getCompanyByCompanyid() {
        return companyByCompanyid;
    }

    public void setCompanyByCompanyid(CompanyEntity companyByCompanyid) {
        this.companyByCompanyid = companyByCompanyid;
    }
}

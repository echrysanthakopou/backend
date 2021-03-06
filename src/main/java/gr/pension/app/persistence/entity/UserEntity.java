package gr.pension.app.persistence.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "mydb", catalog = "")
public class UserEntity {
    private String age;
    private String name;
    private String surname;
    private String gender;
    private String address;
    private String state;
    private String death;
    private String password;
    private Integer id;
    private String email;

    private String amka;
    private String afm;

    private Collection<HistoryworkingEntity> historyworkingsById;
    private BankaccountEntity bankaccountByBankaccount;


    @Basic
    @Column(name = "age", nullable = true, length = 45)
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Basic
    @Column(name = "mail", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname", nullable = true, length = 45)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 45)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 45)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "death", nullable = true, length = 45)
    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amka", nullable = true, length = 45)
    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    @Basic
    @Column(name = "afm", nullable = true, length = 45)
    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(age, that.age) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(address, that.address) &&
                Objects.equals(state, that.state) &&
                Objects.equals(death, that.death) &&
                Objects.equals(password, that.password) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname, gender, address, state, death, password, id);
    }

    @OneToMany(mappedBy = "userByUserid")
    public Collection<HistoryworkingEntity> getHistoryworkingsById() {
        return historyworkingsById;
    }

    public void setHistoryworkingsById(Collection<HistoryworkingEntity> historyworkingsById) {
        this.historyworkingsById = historyworkingsById;
    }

    @ManyToOne
    @JoinColumn(name = "bankaccount", referencedColumnName = "id")
    public BankaccountEntity getBankaccountByBankaccount() {
        return bankaccountByBankaccount;
    }

    public void setBankaccountByBankaccount(BankaccountEntity bankaccountByBankaccount) {
        this.bankaccountByBankaccount = bankaccountByBankaccount;
    }
}

package gr.pension.app.persistence.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "application", schema = "mydb", catalog = "")
public class ApplicationEntity {
    private Integer id;
    private String name;
    private String surname;
    private String city;
    private String street;
    private String email;
    private String number;
    private String numberPhone;
    private String post;
    private String select;
    private String selectTameio;
    private String status;
    private String iban;

    @Lob
    @Column
    private byte[] file;

    @Basic
    @Column(name = "status", nullable = true, length = 45)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "iban", nullable = true, length = 45)
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
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
    @Column(name = "selectTameio", nullable = true, length = 45)
    public String getSelectTameio() {
        return selectTameio;
    }

    public void setSelectTameio(String selectTameio) {
        this.selectTameio = selectTameio;
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
    @Column(name = "city", nullable = true, length = 45)
    public String getCity() {
        return city;
    }

    @Basic
    @Column(name = "street", nullable = true, length = 45)
    public String getStreet() {
        return street;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    @Basic
    @Column(name = "number", nullable = true, length = 45)
    public String getNumber() {
        return number;
    }

    @Basic
    @Column(name = "phoneNum", nullable = true, length = 45)
    public String getNumberPhone() {
        return numberPhone;
    }

    @Basic
    @Column(name = "post", nullable = true, length = 45)
    public String getPost() {
        return post;
    }

    @Basic
    @Column(name = "category", nullable = true, length = 45)
    public String getSelect() {
        return select;
    }

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationEntity that = (ApplicationEntity) o;
        return
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                 Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, surname, id);
    }



}

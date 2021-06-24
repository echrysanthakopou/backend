package gr.pension.app.model;

import java.sql.Date;

public class applicationData {

    private String name;
    private String surname;
    private String city;
    private String street;
    private String email;
    private String number;
    private String numberPhone;
    private String post;
    private String select;


    public applicationData(String name, String surname, String city, String street, String email, String number, String numberPhone, String post, String select) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.street = street;
        this.email = email;
        this.number = number;
        this.numberPhone = numberPhone;
        this.post = post;
        this.select = select;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    @Override
    public String toString() {
        return "applicationData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", post='" + post + '\'' +
                ", select='" + select + '\'' +
                '}';
    }
}


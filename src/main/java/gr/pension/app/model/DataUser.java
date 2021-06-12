package gr.pension.app.model;

public class DataUser {

    private String name;
    private String email;
    private String lastName;

    public DataUser() {
    }

    @Override
    public String toString() {
        return "DataUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DataUser(String name, String email, String lastName) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
    }
}

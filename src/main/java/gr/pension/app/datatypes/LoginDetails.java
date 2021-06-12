package gr.pension.app.datatypes;

public class LoginDetails {

    private String name;
    private String  password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDetails(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDetails{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

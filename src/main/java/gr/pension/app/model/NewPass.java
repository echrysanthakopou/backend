package gr.pension.app.model;

public class NewPass {

    String email;
    String password;
    String oldPass;

    @Override
    public String toString() {
        return "NewPass{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", oldPass='" + oldPass + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPass() {
        return oldPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass;
    }

    public NewPass(String email, String password, String oldPass) {
        this.email = email;
        this.password = password;
        this.oldPass = oldPass;
    }
}

package gr.pension.app.datatypes;

public class ResetData {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ResetData(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ResetData{" +
                "email='" + email + '\'' +
                '}';
    }
}

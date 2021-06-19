package gr.pension.app.model;

import java.sql.Date;

public class applicationData {

    public String name;
    public String email;
    public String type;
    public Date date;

    public applicationData(String name, String email, String type, Date date) {
        this.name = name;
        this.email = email;
        this.type = type;
        this.date = date;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "applicationData{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }

}


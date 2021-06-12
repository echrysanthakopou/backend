package gr.pension.app.model;

import java.sql.Date;

public class InsDetailShort {
    private String id;
    private Date date;

    @Override
    public String toString() {
        return "InsDetailShort{" +
                "id='" + id + '\'' +
                ", date=" + date +
                '}';
    }

    public InsDetailShort(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

package gr.pension.app.datatypes;

import java.sql.Date;

public class DataForCreateNewTreatment {

    private Date date;
    private String product;
    private String totalDoses;
    private String currentDose;
    private String doseQuantity;
    private String unit;
    private String person;
    private Date nextTreamentCheckDate;
    private Integer beehivesId;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getTotalDoses() {
        return totalDoses;
    }

    public void setTotalDoses(String totalDoses) {
        this.totalDoses = totalDoses;
    }

    public String getCurrentDose() {
        return currentDose;
    }

    public void setCurrentDose(String currentDose) {
        this.currentDose = currentDose;
    }

    public String getDoseQuantity() {
        return doseQuantity;
    }

    public void setDoseQuantity(String doseQuantity) {
        this.doseQuantity = doseQuantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Date getNextTreamentCheckDate() {
        return nextTreamentCheckDate;
    }

    public void setNextTreamentCheckDate(Date nextTreamentCheckDate) {
        this.nextTreamentCheckDate = nextTreamentCheckDate;
    }

    public Integer getBeehivesId() {
        return beehivesId;
    }

    public void setBeehivesId(Integer beehivesId) {
        this.beehivesId = beehivesId;
    }

    @Override
    public String toString() {
        return "DataForCreateNewTreatment{" +
                "date=" + date +
                ", product='" + product + '\'' +
                ", totalDoses='" + totalDoses + '\'' +
                ", currentDose='" + currentDose + '\'' +
                ", doseQuantity='" + doseQuantity + '\'' +
                ", unit='" + unit + '\'' +
                ", person='" + person + '\'' +
                ", nextTreamentCheckDate=" + nextTreamentCheckDate +
                ", beehivesId=" + beehivesId +
                '}';
    }

    public DataForCreateNewTreatment(Date date, String product, String totalDoses, String currentDose, String doseQuantity, String unit, String person, Date nextTreamentCheckDate, Integer beehivesId) {
        this.date = date;
        this.product = product;
        this.totalDoses = totalDoses;
        this.currentDose = currentDose;
        this.doseQuantity = doseQuantity;
        this.unit = unit;
        this.person = person;
        this.nextTreamentCheckDate = nextTreamentCheckDate;
        this.beehivesId = beehivesId;
    }
}

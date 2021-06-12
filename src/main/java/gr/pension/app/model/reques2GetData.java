package gr.pension.app.model;

public class reques2GetData {
    private String beehive;
    private String insID;

    public reques2GetData(String beehive, String insID) {
        this.beehive = beehive;
        this.insID = insID;
    }

    public String getBeehive() {
        return beehive;
    }

    public void setBeehive(String beehive) {
        this.beehive = beehive;
    }

    public String getInsID() {
        return insID;
    }

    public void setInsID(String insID) {
        this.insID = insID;
    }
}

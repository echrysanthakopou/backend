package gr.pension.app.datatypes;

public class DataForCreateFinancialCategory {
    String name;
    String description;
    Integer typeId;

    @Override
    public String toString() {
        return "DataForCreateFinancialCategory{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", typeId=" + typeId +
                '}';
    }

    public DataForCreateFinancialCategory(String name, String description, Integer typeId) {
        this.name = name;
        this.description = description;
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}

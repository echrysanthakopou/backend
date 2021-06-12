package gr.pension.app.model;

import java.util.List;

public class DataTrigou {

    private List<data> data;

    private String name;

    private String color;

    @Override
    public String toString() {
        return "DataTrigou{" +
                "data=" + data +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public List<gr.pension.app.model.data> getData() {
        return data;
    }

    public void setData(List<gr.pension.app.model.data> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DataTrigou(List<gr.pension.app.model.data> data, String name, String color) {
        this.data = data;
        this.name = name;
        this.color = color;
    }
}

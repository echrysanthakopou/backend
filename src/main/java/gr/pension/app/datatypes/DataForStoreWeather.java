package gr.pension.app.datatypes;

public class DataForStoreWeather {
    private String conditions;
    private String humidity;
    private String temperature;
    private String windSpeed;
    private String windDirection;
    private String description;

    public DataForStoreWeather(String conditions, String humidity, String temperature, String windSpeed, String windDirection, String description) {

        this.conditions = conditions;
        this.humidity = humidity;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.description = description;
    }

    @Override
    public String toString() {
        return "DataForStoreWeather{" +
                "conditions='" + conditions + '\'' +
                ", humidity='" + humidity + '\'' +
                ", temperature='" + temperature + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


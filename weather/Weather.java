public class Weather {

    private String city;
    private String temperature;
    private String humidity;
    private String windSpeed;
    private String pressure;

    public Weather(String city, String temperature,
                   String humidity, String windSpeed,
                   String pressure) {

        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    public String getCity() {
        return city;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getPressure() {
        return pressure;
    }
}
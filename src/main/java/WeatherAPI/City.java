package WeatherAPI;

/**
 * Created by StasMaster on 17.12.17.
 */
public class City {
    private String name;
    private double temperature;
    private String weatherStatus;
    private String weatherTimestamp;

    public City(String name, double temperature, String weatherStatus, String weatherTimestamp) {
        this.name = name;
        this.temperature = temperature;
        this.weatherStatus = weatherStatus;
        this.weatherTimestamp = weatherTimestamp;
    }


    public City(City city) {
        this.name = city.getName();
        this.weatherStatus = city.getWeatherStatus();
        this.temperature = city.getTempKelvin();
    }


    public City() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTempKelvin() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus;
    }

    public double getTempCelcium() {
        return temperature - 273.15;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", weatherStatus='" + weatherStatus + '\'' +
                ", weatherTimestamp='" + weatherTimestamp + '\'' +
                '}';
    }
}

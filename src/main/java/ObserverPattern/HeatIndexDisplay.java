package ObserverPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeatIndexDisplay implements MyObserver, DisplayElement {
    String updateString;
    WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public String display() {
        return this.getUpdateString();
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        setUpdateString(temp + "," + humidity + "," + pressure);
    }
}

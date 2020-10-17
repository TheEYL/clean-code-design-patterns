package ObserverPattern;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AnotherDisplay implements MyObserver, DisplayElement{

    String  updateString;
    WeatherData weatherData;
    public AnotherDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        setUpdateString(temp+"-" + humidity + "-"+ pressure);
        display();
    }

    @Override
    public String display() {
        return this.getUpdateString();
    }
}

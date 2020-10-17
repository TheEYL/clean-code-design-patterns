package ObserverPattern;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class WeatherData implements Subject{
    //instance variable declarations
    private float temperature;
    private float humidity;
    private float pressure;
    private List<MyObserver> myObserverList  = new ArrayList<>();
    public void measurementsChanged() {
            notifyObservers();
    }


    @Override
    public void registerObserver(MyObserver e) {
            myObserverList.add(e);
    }

    @Override
    public void removeObserver(MyObserver e) {
        myObserverList.remove(e);

    }

    @Override
    public void notifyObservers() {
        for (MyObserver obs : myObserverList) {
            obs.update(this.getTemperature(), this.getHumidity(), this.getPressure());
        }
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = pressure;
        this.pressure = humidity;
    }

}

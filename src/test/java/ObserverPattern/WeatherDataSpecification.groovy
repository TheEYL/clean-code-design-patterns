package ObserverPattern


import org.assertj.core.api.BDDAssertions;
import spock.lang.Specification;

public class WeatherDataSpecification extends Specification {
    def "weatherData must have measurementsChanged method"() {
       given:
       WeatherData weatherData = new WeatherData()
        expect:
        BDDAssertions.then(weatherData.measurementsChanged())
    }
    def "weatherData must have getTemperature method"() {
        given:
        WeatherData weatherData = new WeatherData()
        expect:
        BDDAssertions.then(weatherData.getTemperature())
    }
    def "weatherData must have notifyObservers method"() {
        given:
        WeatherData weatherData = new WeatherData()
        MyObserver obs = new CurrentConditionsDisplay(weatherData);
        expect:
        BDDAssertions.then(weatherData.getMyObserverList()).contains(obs)
    }
    def "weatherData must have removeObserver method"() {
        given:
        WeatherData weatherData = new WeatherData()
        MyObserver obs = new CurrentConditionsDisplay(weatherData);
        when:
            weatherData.removeObserver(obs)
        then:
        BDDAssertions.then(weatherData.getMyObserverList()).hasSize(0)
    }
    def "weatherData must have registerObserver method"() {
        given:
        WeatherData weatherData = new WeatherData()
        expect:
        BDDAssertions.then(weatherData.registerObserver())
    }

    def "observer must have update method" () {
        given:
        WeatherData weatherData = new WeatherData()
        MyObserver obs1 = new CurrentConditionsDisplay(weatherData)
            MyObserver obs2 = new AnotherDisplay(weatherData)
            float temp =1.0;
            float humdity = 3.0;
            float pressure = 0.0;
            weatherData.setMeasurements(temp, humdity,pressure)
        when:
            weatherData.measurementsChanged()
        then:
            BDDAssertions.then(obs2.display()).isEqualTo("1.0-3.0-0.0")
            BDDAssertions.then(obs1.display()).isEqualTo("1.0,3.0,0.0")
    }


    def "weather Station has heatIndex display"() {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(3.0, 4,5)
        MyObserver blue = new HeatIndexDisplay(weatherData)

        when:
            weatherData.measurementsChanged()
        then:
        BDDAssertions.then(blue.display()).contains("3.0")
    }
}

package Pattern2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurement(80, 10, 30.5f);
        weatherData.setMeasurement(10, 40, 313.6f);
    }
}

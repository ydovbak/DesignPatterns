package observer;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement{

    private float currTemperature;
    private float currHumidity;
    private float currPressure;

    private ArrayList<Float> tempList;
    private ArrayList<Float> humidList;
    private ArrayList<Float> pressureList;

    private Subject weatherData;

    public StatisticsDisplay(Subject subject) {
        this.weatherData = subject;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        setCurrTemperature(temp);
        setCurrHumidity(humidity);
        setCurrPressure(pressure);
        display();
    }

    public void setCurrTemperature(float currTemperature) {
        this.currTemperature = currTemperature;
        tempList.add(currTemperature);
    }

    public void setCurrHumidity(float currHumidity) {
        this.currHumidity = currHumidity;
        humidList.add(currHumidity);
    }

    public void setCurrPressure(float currPressure) {
        this.currPressure = currPressure;
        pressureList.add(currPressure);
    }


}

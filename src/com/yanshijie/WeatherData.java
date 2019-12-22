package com.yanshijie;

import java.util.ArrayList;

/**
 * WeatherData
 *
 * @author Joseph
 * @version 1.0
 * 2019/12/22 8:43
 **/
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers=new ArrayList();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        int i=observers.indexOf(o);
        if(i>=0)
        {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer=(Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure)
    {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }



}

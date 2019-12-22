package com.yanshijie;

/**
 * CurrentConditionsDisplay
 *
 * @author Joseph
 * @version 1.0
 * 2019/12/22 8:50
 **/
public class CurrentConditionsDisplay implements Observer,Displayelement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData=weatherData;
        weatherData.register(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }
}

package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double avarageTemerature() {
        double temporatyValue = 0;
        double avarageTemperature = 0;
        for (Map.Entry<String, Double> avT : temperatures.getTemperatures().entrySet()) {
            temporatyValue += avT.getValue();
            return temporatyValue;
        }
        avarageTemperature = temporatyValue / temperatures.getTemperatures().size();
        return avarageTemperature;
    }

    public double medianTemperature() {
        double temporaryAvarage =0;
        double median = 0;
        List<Double> medianList = new ArrayList<>();
        for (Map.Entry<String, Double> mT : temperatures.getTemperatures().entrySet()) {
            medianList.add(mT.getValue());
        }
        Collections.sort(medianList);
        if (medianList.size() % 2 == 0) {
            temporaryAvarage = (medianList.get(medianList.size()/2) + medianList.get((medianList.size()/2)-1));
            median = temporaryAvarage / 2.0;
        } else {
            median = medianList.get(medianList.size()/2);
        }
        return median;

    }
}




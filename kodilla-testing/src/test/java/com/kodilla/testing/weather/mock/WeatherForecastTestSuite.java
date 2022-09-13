package com.kodilla.testing.weather.mock;                                        // [1]

import com.kodilla.testing.weather.stub.Temperatures;                            // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                         // [3]
import org.junit.jupiter.api.Assertions;                                         // [4]
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;                                               // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;                                                        // [6]
import java.util.Map;                                                            // [7]

import static org.mockito.Mockito.mock;                                          // [8]
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {



    @Mock
    private static Temperatures temperaturesMock;

    @BeforeEach
    public void beforeEach() {
        //Given to each test
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 20.0);
        temperaturesMap.put("Krakow", 20.0);
        temperaturesMap.put("Wroclaw", 23.0);
        temperaturesMap.put("Warszawa", 30.0);
        temperaturesMap.put("Gdansk", 30.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

    }

    @Test
    void testCalculateForecastWithMock() {
       //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperatureWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double avarage = weatherForecast.avarageTemerature();

        //Then
        Assertions.assertEquals(23, avarage);
    }

    @Test
    void testCalculateMedianTemperatureWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.medianTemperature();

        //Then
        Assertions.assertEquals(23, median);
    }
}


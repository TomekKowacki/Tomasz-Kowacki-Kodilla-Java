package com.kodilla.good.patterns.challenges.airlines;

import java.util.Objects;

public class Flight {

    private String departureCity;
    private String arrivalCity;
    private int flightNumber;

    public Flight(String departureCity, String arrivalCity, int flightNumber) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.flightNumber = flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public int getFlightNumber(){
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return flightNumber == flight.flightNumber &&
                arrivalCity.equals(flight.arrivalCity) &&
                departureCity.equals(flight.departureCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, arrivalCity, flightNumber);
    }

    @Override
    public String toString() {
        return "Flight" +
                "Departure: " + departureCity + '\'' +
                "Arrival: " + arrivalCity + '\'';
    }
}

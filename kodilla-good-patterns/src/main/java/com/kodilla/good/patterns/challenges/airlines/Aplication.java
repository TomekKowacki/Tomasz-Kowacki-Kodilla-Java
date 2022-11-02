package com.kodilla.good.patterns.challenges.airlines;

public class Aplication {

    public static void main(String[] args) {

        FlightRegister flightRegister = new FlightRegister();

        SearchFlight searchFlight = new SearchFlight(flightRegister.getFlightsList());

        System.out.println(flightRegister.getFlightsList());

        searchFlight.searchByDepartureAirport("Warszawa");
        searchFlight.searchByArrivalAirport("Katowice");
        searchFlight.searchByInterchangeAirport("Rzeszów", "Katowice", "Kraków");
    }
}

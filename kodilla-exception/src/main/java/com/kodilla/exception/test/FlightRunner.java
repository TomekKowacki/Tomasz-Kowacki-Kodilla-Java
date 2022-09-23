package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        SearchFlights search = new SearchFlights();

        Flight flight1 = new Flight("Rawa", "Krakow");

        try {
            search.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Search flight one more time if you want :)");
        }

    }
}

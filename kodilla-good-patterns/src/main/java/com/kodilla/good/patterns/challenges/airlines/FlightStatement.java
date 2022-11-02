package com.kodilla.good.patterns.challenges.airlines;

public class FlightStatement {

    public static FlightRegister flightStatement() {

        Flight flight1 = new Flight("Katowice", "Warszawa", 23);
        Flight flight2 = new Flight("Katowice", "Rzeszów", 43);
        Flight flight3 = new Flight("Warszawa", "Gdańsk", 32);
        Flight flight4 = new Flight("Katowice", "Gdańsk", 34);
        Flight flight5 = new Flight("Warszawa", "Rzeszów",45);
        Flight flight6 = new Flight("Kraków", "Gdańsk",65);
        Flight flight7 = new Flight("Katowice", "Kraków",76);
        Flight flight8 = new Flight("Katowice", "Warszawa", 77);
        Flight flight9 = new Flight("Katowice", "Warszawa",11);
        Flight flight10 = new Flight("Kraków", "Gdańsk",13);
        Flight flight11 = new Flight("Szczecin", "Warszawa",47);
        Flight flight12 = new Flight("Szczecin", "Kraków",19);
        Flight flight13 = new Flight("Szczecin", "Katowice",82);

        FlightRegister flightRegister = new FlightRegister();

        flightRegister.addFlight(flight1);
        flightRegister.addFlight(flight2);
        flightRegister.addFlight(flight3);
        flightRegister.addFlight(flight4);
        flightRegister.addFlight(flight5);
        flightRegister.addFlight(flight6);
        flightRegister.addFlight(flight7);
        flightRegister.addFlight(flight8);
        flightRegister.addFlight(flight9);
        flightRegister.addFlight(flight10);
        flightRegister.addFlight(flight11);
        flightRegister.addFlight(flight12);
        flightRegister.addFlight(flight13);

        return flightRegister;
    }
}

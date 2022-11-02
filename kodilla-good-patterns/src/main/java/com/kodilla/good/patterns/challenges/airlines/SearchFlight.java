package com.kodilla.good.patterns.challenges.airlines;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchFlight {

    private Set<Flight> flightList;

    public SearchFlight(Set<Flight> flightList) {
        this.flightList = flightList;
    }

    public void searchByDepartureAirport(String departureAirport){
        System.out.println("Dostępne loty Do " + departureAirport + "\n");
        flightList.stream()
                .filter(f -> f.getDepartureCity().equals(departureAirport))
                .map(Flight::toString)
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByArrivalAirport(String arrivalAirport){
        System.out.println("Dostępne loty Z " + arrivalAirport + "\n");
        flightList.stream()
                .filter(f->f.getArrivalCity().equals(arrivalAirport))
                .map(Flight::toString)
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByInterchangeAirport(String arrivalAirport, String interchangeAirport, String departureAirport){

        System.out.println("Lista lotów Z: " + departureAirport
                + " DO: " + arrivalAirport + " z PRZESIADKĄ w: " + interchangeAirport + "\n");

        List<Flight> listOfFlightsWithInterChange = flightList.stream()
                .filter(f -> f.getDepartureCity().equals(departureAirport) && f.getArrivalCity().equals(interchangeAirport))
                .collect(Collectors.toList());

        flightList.stream()
                .filter(f -> f.getDepartureCity().equals(interchangeAirport) && f.getArrivalCity().equals(arrivalAirport))
                .collect(Collectors.toCollection(() -> listOfFlightsWithInterChange));

        listOfFlightsWithInterChange.stream()
                .forEach(System.out::println);

        System.out.println();
    }
}

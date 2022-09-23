package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class SearchFlights {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airPortsMap = new HashMap<>();

        airPortsMap.put("Krakow", true);
        airPortsMap.put("Warsaw", true);
        airPortsMap.put("Katowice", true);
        airPortsMap.put("Amsterdam", true);
        airPortsMap.put("Berlin", true);
        airPortsMap.put("Oslo", true);
        airPortsMap.put("Wroclaw", true);

        boolean departure = airPortsMap.containsKey(flight.getDepartureAirport());
        boolean arrival = airPortsMap.containsKey(flight.getArrivalAirport());


        if(!departure){
            throw  new RouteNotFoundException("There's no Departure Airport such " + flight.getDepartureAirport());
        }else if (!arrival){
            throw  new RouteNotFoundException("There's no Arrival Airport such " + flight.getArrivalAirport());
        }else {
            System.out.println("Connection found between the given airports");
            return true;
        }

    }
}

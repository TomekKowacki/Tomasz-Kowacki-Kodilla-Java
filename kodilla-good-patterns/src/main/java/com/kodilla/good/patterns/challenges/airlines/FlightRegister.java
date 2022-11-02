package com.kodilla.good.patterns.challenges.airlines;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FlightRegister {

    private Set<Flight> flightsList = new HashSet<Flight>();

    public Set<Flight> getFlightsList(){
        return Collections.unmodifiableSet(flightsList);
    }

    public boolean addFlight(Flight flight){
        flightsList.add(flight);
        return true;
    }
}

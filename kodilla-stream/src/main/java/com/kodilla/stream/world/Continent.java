package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private final List<Country> countriesInContinent;

    public Continent(List<Country> countriesInContinent) {
        this.countriesInContinent = countriesInContinent;
    }
    public List<Country> getCountriesInContinent(){
        return countriesInContinent;
    }
}

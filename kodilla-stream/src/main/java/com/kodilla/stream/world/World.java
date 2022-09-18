package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private final List<Continent> continetns;

    public World(List<Continent> continetns) {
        this.continetns = continetns;
    }
    public BigDecimal getPeopleQuantity(){
        return continetns.stream()
                .flatMap(continent -> continent.getCountriesInContinent().stream())
                .map(country -> country.getPeopleQuantityInTheCountry())
                .reduce(BigDecimal.ZERO, (total, courent) -> total = total.add(courent));

    }
}

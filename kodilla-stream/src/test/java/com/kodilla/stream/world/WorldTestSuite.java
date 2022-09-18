package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        List<Country> asianCountry = new ArrayList<>();
        asianCountry.add(new Country("Japan", new BigDecimal("100000000")));
        asianCountry.add(new Country("China", new BigDecimal("500000000")));
        asianCountry.add(new Country("Korea", new BigDecimal("200000000")));

        List<Country> europenanCountry = new ArrayList<>();
        europenanCountry.add(new Country("Poland", new BigDecimal("40000000")));
        europenanCountry.add(new Country("Germany", new BigDecimal("60000000")));
        europenanCountry.add(new Country("Russia", new BigDecimal("100000000")));

        List<Country> americanCountry = new ArrayList<>();
        americanCountry.add(new Country("USA", new BigDecimal("500000000")));
        americanCountry.add(new Country("Canada", new BigDecimal("200000000")));

        Continent asia = new Continent(asianCountry);
        Continent europe = new Continent(europenanCountry);
        Continent america = new Continent(americanCountry);

        List<Continent> continets = new ArrayList<>();
        continets.add(asia);
        continets.add(europe);
        continets.add(america);

        World world = new World(continets);

        //When
        BigDecimal calculatedWorldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedWorldPopulation = new BigDecimal("1700000000");
        assertEquals(expectedWorldPopulation,calculatedWorldPopulation);



    }
}

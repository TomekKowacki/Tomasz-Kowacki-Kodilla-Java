package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    private static int orderCounter = 0;

    @BeforeEach
    public void beforeEachTest(){

        orderCounter++;
        System.out.println("\nOrder number " + orderCounter);
    }

    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        // When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();

        System.out.println(description);
        System.out.println("Price: " + calculatedCost + " PLN");

        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
        assertEquals("Standard pizza: pizza dough, tomato sauce, cheese", description);

    }

    @Test
    public void testPizzaWithMushroomHamPaprikaSaladOrder(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new RedPaprikaDecorator(theOrder);
        theOrder = new SaladDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();

        System.out.println(description);
        System.out.println("Price: " + calculatedCost + " PLN");

        // Then
        assertEquals(new BigDecimal(29), calculatedCost);
        assertEquals("Standard pizza: pizza dough, tomato sauce, cheese" +
                " \n+ Ham \n+ Mushrooms \n+ Red paprika \n+ Salad", description);
    }

    @Test
    public void testPizzaWithMushroomChickenPaprikaSalamiOnionOrder(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new RedPaprikaDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();

        System.out.println(description);
        System.out.println("Price: " + calculatedCost + " PLN");

        // Then
        assertEquals(new BigDecimal(33), calculatedCost);
        assertEquals("Standard pizza: pizza dough, tomato sauce, cheese" +
                " \n+ Mushrooms \n+ Chicken \n+ Red paprika \n+ Salami \n+ Onion", description);
    }

}

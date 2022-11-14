package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigMac.Bigmac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BigmacBuilder.BUN_WITH_SESAME)
                .burgers(2)
                .ingredients(Bigmac.BigmacBuilder.BACON)
                .ingredients(Bigmac.BigmacBuilder.CHILI)
                .ingredients(Bigmac.BigmacBuilder.CHEESE)
                .sauce(Bigmac.BigmacBuilder.BARBECUE_SAUCE)
                .build();
        System.out.println(bigmac);

        //When
        String chosenBun = bigmac.getBun();
        String chosenSauce = bigmac.getSauce();
        int numberOfBurgers = bigmac.getBurgers();
        int numberOfIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals("BUN_WITH_SESAME", chosenBun);
        assertEquals("BARBECUE_SAUCE", chosenSauce);
        assertEquals(2,numberOfBurgers);
        assertEquals(3,numberOfIngredients);
    }
}

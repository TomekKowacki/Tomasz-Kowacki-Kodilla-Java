package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User tomek = new Millenials("Tomek Kow");
        User dominika = new YGeneration("Dominika Bow");
        User bogdan = new ZGeneration("Bogdan Now");

        //When
        String tomekShouldUse = tomek.sharePost();
        System.out.println("Tomek use " + tomekShouldUse);
        String dominikaShouldUse = dominika.sharePost();
        System.out.println("Dominika use " + dominikaShouldUse);
        String bogdanShouldUse = bogdan.sharePost();
        System.out.println("Bogdan use " + bogdanShouldUse);

        //Then
        assertEquals("Facebook", tomekShouldUse);
        assertEquals("Snapchat", dominikaShouldUse);
        assertEquals("Twitter", bogdanShouldUse);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User tomek = new Millenials("Tomek Kow");

        //When
        String tomekShouldUse = tomek.sharePost();
        System.out.println("Tomek use " + tomekShouldUse);
        tomek.setSocialPublisher(new TwitterPublisher());
        tomekShouldUse = tomek.sharePost();
        System.out.println("Tomek use " + tomekShouldUse);

        //Then
        assertEquals("Twitter", tomekShouldUse);
    }
}

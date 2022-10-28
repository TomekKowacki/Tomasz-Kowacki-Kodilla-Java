package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String titleString = movieStore.getMovies().entrySet().stream()
                .flatMap(tittle -> tittle.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(titleString);
    }
}

package com.kodilla.patterns.strategy.social;

public non-sealed class Millenials extends User {

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}

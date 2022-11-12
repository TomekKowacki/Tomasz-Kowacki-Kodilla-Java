package com.kodilla.patterns.strategy.social;

public non-sealed class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}

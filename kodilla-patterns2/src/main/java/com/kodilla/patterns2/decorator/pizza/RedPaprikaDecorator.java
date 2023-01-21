package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class RedPaprikaDecorator extends AbstractPizzaOrderDecorator{

    protected RedPaprikaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " \n+ Red paprika";
    }
}

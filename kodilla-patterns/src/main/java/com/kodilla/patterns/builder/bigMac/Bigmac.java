package com.kodilla.patterns.builder.bigMac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final int burgers;
    private String sauce;
    private List<String> ingredients;

    public static class BigmacBuilder {

        public static final String BUN_WITH_SESAME = "BUN_WITH_SESAME";
        public static final String BUN_WITHOUT_SESAME = "BUN_WITHOUT_SESAME";
        public static final String STANDARD_SAUCE = "STANDARD_SAUCE";
        public static final String ONE_THOUSAND_ISLANDS_DRESSING = "1000_ISLANDS_DRESSING";
        public static final String BARBECUE_SAUCE = "BARBECUE_SAUCE";
        public static final String LETTUCE = "LETTUCE";
        public static final String ONION = "ONION";
        public static final String BACON = "BACON";
        public static final String CUCUMBER = "CUCUMBER";
        public static final String CHILI = "CHILI";
        public static final String MUSHROOMS = "MUSHROOMS";
        public static final String SHRIMPS = "SHRIMPS";
        public static final String CHEESE = "CHEESE";

        private List<String> availableSauces = Arrays.asList(BARBECUE_SAUCE, ONE_THOUSAND_ISLANDS_DRESSING, STANDARD_SAUCE);
        private List<String> availableIngredients = Arrays.asList(LETTUCE, ONION, BACON,
                CUCUMBER, CHILI, MUSHROOMS, SHRIMPS, CHEESE);

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun (String bun){
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers (int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce (String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients (String ingredients) {
            this.ingredients.add(ingredients);
            return this;
        }

        public Bigmac build() {
            if (!bun.equals(BUN_WITH_SESAME) && !bun.equals(BUN_WITHOUT_SESAME)) {
                throw new IllegalStateException("You choose wrong bun ");
            }
            if (burgers < 1 || burgers > 3) {
                throw new IllegalStateException("You should change numbers of burgers: ");
            }
            if (!availableSauces.contains(sauce)) {
                throw new IllegalStateException("Chosen sauce doesn't exist: " + sauce);
            }
            for (String currentIngredient : ingredients) {
                if (!availableIngredients.contains(currentIngredient)) {
                    throw new IllegalStateException("Chosen ingredients doesn't exist " + currentIngredient);
                }
            }
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Your Bigmac: {" +
                "bun ='" + bun + '\'' +
                ", burgers = " + burgers +
                ", sauce = '" + sauce + '\'' +
                ", ingredients = " + ingredients +
                '}';
    }
}

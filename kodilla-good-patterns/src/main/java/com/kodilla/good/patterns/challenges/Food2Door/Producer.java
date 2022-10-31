package com.kodilla.good.patterns.challenges.Food2Door;

public class Producer {

    private String name;
    private String residenceAddress;

    public Producer(String name, String residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }

    public String getName() {
        return name;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producer producer = (Producer) o;

        if (!name.equals(producer.name)) return false;
        return residenceAddress.equals(producer.residenceAddress);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + residenceAddress.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\nProducer..." +
                "name = " + name +
                " residenceAddress = '" + residenceAddress;
    }
}

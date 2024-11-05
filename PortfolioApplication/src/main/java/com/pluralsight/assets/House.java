package com.pluralsight.assets;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double value) {
        super(name, value);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}

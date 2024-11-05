package com.pluralsight.assets;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat) {
        super(name, karat);
    }

    @Override
    public double getValue() {
        return this.karat;
    }
}

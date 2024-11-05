package com.pluralsight.assets;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double value) {
        super(name, value);
    }

    @Override
    public double getValue() {
        return super.getValue();
        // return this.weight;
    }
}

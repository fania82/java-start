package com.andrew.homework.lesson14;

public class RealEstate {

public final float square;
public final float tax;
    public float totalEarning;

    public RealEstate(float square, float tax) {
        this.square = square;
        this.tax = tax;
    }

    public float calculateTax (float square, float tax) {
        return  square * tax;
    }
    public float getSquare() {
        return square;
    }
    public float getTax() {
        return tax;
    }
    public float getTotalEarnings() {
        return totalEarning;
    }

}

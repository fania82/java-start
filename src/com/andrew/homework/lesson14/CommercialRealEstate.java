package com.andrew.homework.lesson14;

public class CommercialRealEstate extends RealEstate {

    public float totalEarnings;
    public float areaSquare;

    public CommercialRealEstate(float square, float tax, float totalEarnings) {
        super(square, tax);
        this.totalEarnings = totalEarnings;
    }

}

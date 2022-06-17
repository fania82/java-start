package com.andrew.homework.lesson14;

public class ResidentalRealEstate extends RealEstate {

    public  float subsidy;



    public ResidentalRealEstate(float square, float tax, float subsidy) {
        super(square, tax);
        this.subsidy = subsidy;
    }
}

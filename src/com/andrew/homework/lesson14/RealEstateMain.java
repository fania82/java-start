package com.andrew.homework.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealEstateMain {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        float commercialTax = 0.2f;
        float indastrialTax = 0.4f;
        float residentalTax = 0.6f;
        System.out.println("Input type of Your estate: 1 - Industrial, 2 - Commercial, 3- Residental ");
        int typeOfEstate = Integer.parseInt(READER.readLine());
        calculateTaxForEstate(commercialTax, indastrialTax, residentalTax, typeOfEstate);
    }

    private static void calculateTaxForEstate(float commercialTax, float indastrialTax, float residentalTax, int typeOfEstate) throws IOException {
        switch (typeOfEstate) {
            case 1:
                System.out.println("Input square of Your industrial estate: ");
                float indastrialSquare = Float.parseFloat(READER.readLine());
                RealEstate indastrial = new IndastrialRealEstate(indastrialSquare, indastrialTax);
                float resultForIndustrial = indastrial.calculateTax(indastrial.getSquare(), indastrial.getTax());
                System.out.println("You tax is:");
                System.out.printf("%.2f", resultForIndustrial);
                break;
            case 2:
                System.out.println("Input square of Your commercial estate: ");
                float commercialSquare = Float.parseFloat(READER.readLine());
                System.out.println("Input Your earning: ");
                float totalComercialEarning = Float.parseFloat(READER.readLine());
                RealEstate comercial = new CommercialRealEstate(commercialSquare, commercialTax, totalComercialEarning);

                if (totalComercialEarning < 100) {
                    System.out.println("You don't need to pay tax");
                } else {
                    float resultForCommercial = comercial.calculateTax(comercial.getSquare(), comercial.getTax());
                    System.out.println("You tax is:");
                    System.out.printf("%.2f", resultForCommercial);
                }
                break;
            case 3:
                float subsidy;
                System.out.println("Input square of Your residential estate: ");
                float residentalSquare = Float.parseFloat(READER.readLine());
                if (residentalSquare <= 100) {
                    subsidy = 0.2f;
                } else if (residentalSquare <= 1000) {
                    subsidy = 0.4f;
                } else {
                    subsidy = 0.8f;
                }
                RealEstate residental = new ResidentalRealEstate(residentalSquare, residentalTax, subsidy);
                float resultForResidental = (residental.calculateTax(residental.getSquare(), residental.getTax())) * subsidy;
                System.out.println("You tax is:");
                System.out.printf("%.2f", resultForResidental);
                break;
        }
    }
}

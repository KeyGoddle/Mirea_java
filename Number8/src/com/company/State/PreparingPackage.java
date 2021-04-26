package com.company.State;

public class PreparingPackage implements Parcel {
    @Override
    public void makeDelivery() {
        System.out.println("Упаковка и сборка посылки!");
    }
}

package com.company.Strategy;

import com.company.State.Parcel;

public class PreparingPackage implements Parcel {
    @Override
    public void makeDelivery() {
        System.out.println("Упаковка и сборка посылки!");
    }
}

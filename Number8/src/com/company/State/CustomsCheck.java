package com.company.State;

public class CustomsCheck implements Parcel{
    @Override
    public void makeDelivery() {
        System.out.println("Проверка посылки на таможне!");
    }
}

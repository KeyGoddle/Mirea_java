package com.company.Strategy;

import com.company.State.Parcel;

public class CustomsCheck implements Parcel {
    @Override
    public void makeDelivery() {
        System.out.println("Проверка посылки на таможне!");
    }
}

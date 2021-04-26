package com.company.Strategy;

import com.company.State.Parcel;

public class ProcessingRequest implements Parcel {
    @Override
    public void makeDelivery() {
        System.out.println("Обработка запроса клиента!");
    }
}

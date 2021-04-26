package com.company.State;

public class ProcessingRequest implements Parcel{
    @Override
    public void makeDelivery() {
        System.out.println("Обработка запроса клиента!");
    }
}

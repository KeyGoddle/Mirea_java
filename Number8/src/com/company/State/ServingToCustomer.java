package com.company.State;

public class ServingToCustomer implements Parcel{
    @Override
    public void makeDelivery() {
        System.out.println("Выдача посылки клиенту!");
    }
}

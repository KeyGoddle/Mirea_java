package com.company.Strategy;

import com.company.State.Parcel;

public class ServingToCustomer implements Parcel {
    @Override
    public void makeDelivery() {
        System.out.println("Выдача посылки клиенту!");
    }
}

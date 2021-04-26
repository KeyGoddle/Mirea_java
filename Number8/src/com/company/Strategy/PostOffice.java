package com.company.Strategy;

import com.company.State.Parcel;

public class PostOffice {
    Parcel parcel;
    public void stateOfParcel(Parcel parcel){
        this.parcel = parcel;
    }

    public void makeDelivery() {
        parcel.makeDelivery();
    }
}

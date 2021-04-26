package com.company.Adapter;

public class Main_Adapter {

    public static void main(String[] args) {
        Database db = new AdapterDatabase();
        db.load();
        db.insert();
        db.update();
        db.remove();
    }
}

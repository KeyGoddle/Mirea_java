package com.company.Proxy;

public class ProxyDatabase implements Database{
    String db;
    StandardDatabase stdb;
    public ProxyDatabase(String db){
        this.db = db;
    }
    @Override
    public void display() {
        if (stdb == null){
            System.out.println("Создание пустой базы данных...");
            stdb = new StandardDatabase(db);
        }
        stdb.display();
    }
}

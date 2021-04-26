package com.company.Proxy;

public class StandardDatabase implements Database{
    String db;
    public StandardDatabase(String db){
        this.db = db;
        load();
    }
    void load(){
        System.out.println("Загрузка данных из "+db);
    }
    @Override
    public void display() {
        System.out.println("Вывод данных из "+db);
    }
}

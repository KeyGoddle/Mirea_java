package com.company.Proxy;

public class Main_Proxy {

    public static void main(String[] args) {
        System.out.println("Загрузка и вывод данных:");
        Database stdb = new StandardDatabase("oracle.db");
        stdb.display();
        System.out.println("\nЗагрузка данных при отсутсвии данных:");
        Database stdb2 = new StandardDatabase(null);
        //stdb2.display();

        System.out.println("-----------------------");
        System.out.println("Загрузка и вывод данных из:");
        Database proxydb = new ProxyDatabase("oracle.db");
        proxydb.display();
        Database proxydb2 = new ProxyDatabase(null);
        //proxydb2.display();
    }
}

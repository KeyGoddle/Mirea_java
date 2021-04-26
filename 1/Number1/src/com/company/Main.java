package com.company;
import static java.lang.Math.abs;
import java.util.Scanner;
import 

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        float a = scan.nextFloat();
        string[]as;
        System.out.println("Введите строку");
        float str0 = scan.nextString();
        for (int i=0; i<a; i++) {
            System.out.println("Введите строку");
            float str1 = scan.nextString();
            x=str0.length;
            y=str1.length;
            toConsume comp = new toConsume();
            comp.compare(x, y);
        }

    }
}
interface Consumer {
    void compare(float x, float y);
}
class toConsume implements Consumer {
    public void compare(float x, float y) {
        if (abs(x) > abs(y)){
            System.out.println("Первое число больше второго по модулю");
        }
        else if (abs(x) == abs(y)){
            System.out.println("Первое и второе числа равны по модулю");
        }
        else {
            System.out.println("Первое число меньше второго по модулю");
        }
    }
}
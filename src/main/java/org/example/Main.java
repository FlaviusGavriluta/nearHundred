package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(211));
    }

    public static boolean nearHundred(int n) {
        return (10 >= Math.abs(100 - n)) || (10 >= Math.abs(200 - n));
    }
}
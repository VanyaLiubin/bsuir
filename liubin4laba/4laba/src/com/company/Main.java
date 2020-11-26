package com.company;

public class Main {

    public static void main(String[] args) {
        HeavyCar car3 = new HeavyCar();
        car3.ride();
        car3.printInfo();

        Minivan car5 = new Minivan();
        car5.ride();
        car5.printInfo();

        Bus car4 = new Bus();
        car4.ride();
        car4.printInfo();
    }
    }
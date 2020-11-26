package com.company;
public class WriterInfo {
    /*private static Clothes clothes;*/// класс для вывода информации о классах на экран
    public static void main(String[] args) {
            Jacket clothes1 = new Jacket("Bershka", 170, "classical");
            System.out.println("Manufacturer: " + clothes1.getManufacturer());
            System.out.println("Price: " + clothes1.getPrice());
            System.out.println("Style: " + clothes1.getStyle());

        Trousers clothes2 = new Trousers("H&M", 89, "casual");
        System.out.println("Manufacturer: " + clothes2.getManufacturer());
        System.out.println("Price: " + clothes2.getPrice());
        System.out.println("Style: " + clothes2.getStyle());

        Blouse clothes3 = new Blouse("Mango", 135, "home");
        System.out.println("Manufacturer: " + clothes3.getManufacturer());
        System.out.println("Price: " + clothes3.getPrice());
        System.out.println("Style: " + clothes3.getStyle());
    }
}

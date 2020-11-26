package com.company;

import java.io.*;

public class Product {

    private String name;
    private boolean availability;
    private int price;
    void InputInFile()throws IOException {
        File file = new File("document.doc");
        file.deleteOnExit();

        FileWriter writer;
        writer = new FileWriter(file,true);
        writer.append("\nName of product: "+this.name+"; price: "+this.price+"; ");
        if (this.availability)
            writer.append("not in stock.\n");
        else writer.append("in stock.\n");
        writer.flush();
        writer.close();
    }
    private static void OutputOfFile() throws IOException{
        File file = new File("document.doc");

        FileReader reader;
        char buffer[];
        int numb;
        buffer=new char[1];
        reader = new FileReader(file);
        do{
            numb=reader.read(buffer);
            System.out.print(buffer[0]);
        }while(numb==1);
        reader.close();
    }
    Product () throws IOException {
        String bolv;
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
        System.out.print("\nPut the name of product: ");
        this.name = input.readLine();
        System.out.print("\nPut price: ");
        this.price = (int) Double.parseDouble(input.readLine());
        while (true) {
            System.out.print("\nAvailability: ");
            bolv = input.readLine();
            if ("yes".equals(bolv)) {
                this.availability = true;
                break;
            }
            if ("no".equals(bolv)) {
                this.availability = false;
                break;
            }
            System.out.print("\nError! Try again!");
        }
    }
}

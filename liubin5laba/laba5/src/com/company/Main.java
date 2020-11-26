package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private String name;
    private boolean availability;
    private int price;

    public static void main(String[] args) throws IOException {
                Product[] products;
                products= new Product[3];
                for (int i=0; i<3; i++)
                    products[i]= new Product();
                for(int i=0;i<3;i++)
                    products[i].InputInFile();
                OutputOfFile();
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

}




package ru.mirea.ikbo01_19.lab9.Rogov;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey(){
        Scanner myScanner = new Scanner( System.in );

        boolean f = true;

        while (f) {
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();

            f = false;
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                f = true;
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
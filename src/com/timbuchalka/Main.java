package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        String jakisString = "Greetings";
        jakisString = jakisString.substring(0, 3) + "Brzydal";
        System.out.println(jakisString + " hallo ");
        String nowystring = "czeSC!";
        if (nowystring.equalsIgnoreCase("CZeSC!")) {
            System.out.println("Prawda");
        }
    }
}




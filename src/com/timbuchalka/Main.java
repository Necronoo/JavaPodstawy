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
        else {
            System.out.println("nieprawda");
        }
        //3.6.5
        if( nowystring.lenght()==0){
            System.out.println("prawda");
        }
        else{
            System.out.println("nieprwada");
        }

    }
}




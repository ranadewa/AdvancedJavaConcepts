package com.company;

import java.util.ArrayList;

public class OliveJarInstanceFields {

    public ArrayList<Olive> olivesArray;

    {
        System.out.println("Instance field initialising");
        olivesArray = new ArrayList<Olive>();
        olivesArray.add(new Olive("H"));
        olivesArray.add(new Olive("U"));
        olivesArray.add(new Olive("U"));
        olivesArray.add(new Olive("B"));
    }

    public OliveJarInstanceFields(){

        System.out.println("Constructor");
    }

    public OliveJarInstanceFields(int num){

        System.out.println("Constructor");
    }

}

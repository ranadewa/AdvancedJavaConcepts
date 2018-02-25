package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Olive> oliveArray = OliveJarStaticField.oliveArray;

        for (Olive olive:oliveArray ) {
            System.out.println(olive);
        }

        OliveJarInstanceFields ojIF = new OliveJarInstanceFields();

        for (Olive olive:ojIF.olivesArray ) {
            System.out.println(olive);
        }
    }
}

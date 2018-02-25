package com.company;

import java.util.ArrayList;

public class OliveJarStaticField {

    public static ArrayList<Olive> oliveArray;

    static {
        oliveArray = new ArrayList<Olive>();

        oliveArray.add(new Olive("Kalamata"));
        oliveArray.add(new Olive("Gerbidi"));
        oliveArray.add(new Olive("Gerbidw"));
    }
}

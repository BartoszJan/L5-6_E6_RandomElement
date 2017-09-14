package com.mojafirma;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Bartek on 2017-07-25.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(1); list.add("Ala"); list.add(80); list.add("ma"); list.add(7); list.add("kota"); list.add(51); list.add(34);

        RandomElement randomElement = new RandomElement();
        System.out.println(randomElement.drawElement(list));
    }
}

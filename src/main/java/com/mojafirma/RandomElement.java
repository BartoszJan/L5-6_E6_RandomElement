package com.mojafirma;

import java.util.ArrayList;
import java.util.Random;

public class RandomElement<T extends ArrayList> {

    Object drawElement (T elements ) {

        Random random = new Random();
        int elementNum = random.nextInt(elements.size());
        return elements.get(elementNum);
    }
}

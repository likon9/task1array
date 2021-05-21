package com.company.serviceclasses;

import com.company.entity.CreateArray;

import java.util.Arrays;

public class SearchMaxValueMinValue extends CreateArray {

    public SearchMaxValueMinValue() {

        generatingArray();
        Arrays.sort(getArray());
        int maxValue = getArray()[getArray().length - 1];
        System.out.println("Максимальное значение" + maxValue);

        int minValue = 0;

        for (int i = 0; i < getArray().length; i++) {
            if (getArray()[i] < getArray()[0]) {
                minValue = getArray()[i];
            }
        }
        System.out.println("Минимальное значение" + minValue);

    }

}

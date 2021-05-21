package com.company.serviceclasses;

import com.company.entity.CreateArray;

public class DeterminingNumberOfPositiveNumberOfNegative extends CreateArray {

    public DeterminingNumberOfPositiveNumberOfNegative() {

        generatingArray();
        int numberOfPositive = 0;
        int numberOfNegative = 0;

        for (int i = 0; i < getArray().length; i++){
            if (getArray()[i] > 0){
                numberOfPositive++;
            }
            else {
                numberOfNegative++;
            }
        }

        System.out.println("Количество положительных элементов = " + numberOfPositive);
        System.out.println("Количество отрицательных элементов = " + numberOfNegative);

    }
}

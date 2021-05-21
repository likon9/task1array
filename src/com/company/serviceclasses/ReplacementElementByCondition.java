package com.company.serviceclasses;

import com.company.entity.CreateArray;

import static java.lang.Math.abs;

public class ReplacementElementByCondition extends CreateArray {

    public ReplacementElementByCondition() {

        generatingArray();
        System.out.println("Исходный массив:");

        for (int i = 0 ; i < getArray().length; i++ ){
            System.out.println(getArray()[i]);
        }

        for(int i = 0; i < getArray().length; i++){
            if(getArray()[i]<0){
                getArray()[i] = abs(getArray()[i]); // нахождение модуля отрицательного числа в массиве
            }
        }

        System.out.println("Полученный массив:");

        for (int i = 0 ; i < getArray().length; i++ ){
            System.out.println(getArray()[i]);
        }

    }
}

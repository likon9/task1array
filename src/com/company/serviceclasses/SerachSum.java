package com.company.serviceclasses;

import com.company.entity.CreateArray;

public class SerachSum extends CreateArray {

    public SerachSum() {

        generatingArray();
        int SumElements = 0;

        for(int i = 0 ; i < getArray().length; i++){
            SumElements = SumElements + getArray()[i];
        }

        System.out.println("Сумма элементов в массиве = " + SumElements);

    }
}

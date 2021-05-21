package com.company.serviceclasses;

import com.company.entity.CreateArray;

public class SearchMean extends CreateArray{

    public SearchMean() {

        generatingArray();
        int SumElements = 0;

        for(int i = 0 ; i < getArray().length; i++){
            SumElements = SumElements + getArray()[i];
        }

        System.out.println("Среднее значение = " + SumElements / getArray().length);

    }
}

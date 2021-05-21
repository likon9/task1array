package com.company.entity;

public class CreateArray {

    int [] array = new int [15];

    public void generatingArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31) - 15);
            System.out.println(array[i]);
        }
    }

    public int[] getArray() {
        return array;
    }
}

package com.Array;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] array = {10,20,30,40,45};
        int[][] multiDimensionalArray = {
                {30,40},
                {70,80},
                {101,201}
        };
        System.out.println(array[1]);
        System.out.println(array[3]);
        System.out.println(multiDimensionalArray[0].length);
        System.out.println(multiDimensionalArray[2].length);
    }
}

package com.example.task08;

import java.lang.reflect.Array;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        if (arr.length == 0)
            return 0;
        long mult = 1;
        for (int num : arr) {
            mult *= num;
        }
        return mult;
    }

}
package com.company;

public class FirstTask {
    public static void main(String[] args) {
        int[] array = {14, 11, 99, 23, -24, 1, 2, 8, 0, -17, 22, 56, 90, 71, 63, -124, 45, -1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
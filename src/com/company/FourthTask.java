package com.company;

public class FourthTask {
    public static void main(String[] args) {
        int[] array = {14, 11, 99, 23, -24, 1, 2, 8, 0, -17, 22, 56, 90, 71, 63, -124, 45, -1, 13, 155, -122};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
    }
}

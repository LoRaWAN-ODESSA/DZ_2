package com.company;

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int[] fibonacci = new int[20];
        for (int i = 0; i < fibonacci.length; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            }
        }
        System.out.println(Arrays.toString(fibonacci));
    }
}

package com.company;

public class FirstTask {
    public static void main(String[] args) {
        int[] array = {16, 11, 99, 23, -24, 1, 2, 8, 0, -17, 22, 56, 90, 71, 63, -124, 45, -1, 13};
        System.out.print("Четные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("\nНечетные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}
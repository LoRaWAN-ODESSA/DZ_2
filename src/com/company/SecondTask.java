package com.company;

public class SecondTask {
    public static void main(String[] args) {
        int[] array = {16, 11, 99, 23, -24, 1, 2, 8, 0, -17, 22, 56, 90, 71, 63, -124, 45, -1, 13};
        for (int i = 0; i < array.length; i++) {
            boolean isSimple = true;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isSimple = false;
                }
            }
            if (array[i] > 1 && isSimple) {
                System.out.println(array[i]);
            }
        }
    }
}

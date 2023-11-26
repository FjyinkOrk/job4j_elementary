package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {

        for (int i = 0, j = 1; i < array.length; i++, j++) {
            int temp = array[i];
            array[i] = array[array.length - j];
            array[array.length - j] = temp;
            if (i == array.length / 2 - 1) {
                break;
            }
        }
        return array;
    }
}

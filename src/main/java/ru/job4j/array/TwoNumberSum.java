package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] rls = new int[2];
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                rls[0] = i;
                rls[1] = j;
                return rls;
            }
            if (array[i] + array[j] != target) {
                j++;
            }
            if (j == array.length - 1) {
                i++;
                j = i + 1;
            }
        }
        return new int[0];
    }
}

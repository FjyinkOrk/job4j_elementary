package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return left >= right && left >= third ? left : (right >= left && right >= third ? right : third);
    }

    public static int max(int left, int right, int third, int fourth) {
        int result;
        if (left >= right && left >= third && left >= fourth) {
            result = left;
        } else if (right >= third && right >= fourth) {
            result = right;
        } else if (third >= fourth) {
            result = third;
        } else {
            result = fourth;
        }
        return result;
    }

    public static void main(String[] args) {
        Max.max(10, 5);
    }
}

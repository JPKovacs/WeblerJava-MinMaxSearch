package model;

public class Min {

    // as we want a return value, int is a better to return instead of void!!!

    public int minOfNums(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
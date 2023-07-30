package model;

public class Max {

    // as we want a return value, int is a better to return instead of void!!!

    public int maxOfNums(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
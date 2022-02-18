package lesson_5;

import java.util.Arrays;

public class ReplacementArr {
    public static void main(String args[]) {
        Integer[] arr1 = {2, 6, 9, 10, 55};
        String[] arr2 = {"2", "6", "9", "10", "55"};

        repArr(arr1, 2, 4);
        repArr(arr2, 1, 3);
    }

    public static void repArr(Object[] arr, int n1, int n2) {
        Object s = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = s;
        System.out.println("Результат замены: " + Arrays.toString(arr));
    }

}

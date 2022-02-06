package lesson_2;

public class InvertArray {

    public static void invertArray() {
        int[] arr = {0, 1, 0, 1, 0, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }

    }
}


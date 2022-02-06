package lesson_2;

public class Diagonal {

    public static void diagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j || i + j == 3) arr[i][j] = 1;
            }
        }
    }
}


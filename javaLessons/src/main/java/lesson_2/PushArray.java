package lesson_2;

public class PushArray {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 0;
        int[] arr1 = pushArray(arr, n);
        for (int a : arr1) {
            System.out.print(a);
        }

    }


    public static int[] pushArray(int[] inAr, int n) {
        if (n > 0) {
            while (n > 0) {
                int a = inAr[inAr.length - 1];
                for (int i = 0; i < inAr.length; i++) {
                    int b = inAr[i];
                    inAr[i] = a;
                    a = b;
                }
                n--;
            }
        } else {
            while (n < 0) {

                int a = inAr[0];
                for (int i = inAr.length - 1; i >= 0; i--) {
                    int b = inAr[i];
                    inAr[i] = a;
                    a = b;
                }
                n++;
            }
        }
        return inAr;
    }
}







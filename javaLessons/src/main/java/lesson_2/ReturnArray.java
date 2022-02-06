package lesson_2;

public class ReturnArray {

    public static void main(String args[]) {
        int[] arr1 = returnArray(5, 6);
        for (int q : arr1
        ) {
            System.out.print(q);
        }
    }

    public static int[] returnArray(int len, int iv) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = iv;
        }
        return arr;
    }
}

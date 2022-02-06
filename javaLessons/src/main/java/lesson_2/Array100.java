package lesson_2;

public class Array100 {
    public static void main(String args[]) {
        array100();
    }

    public static void array100() {

        int[] array = new int[100];
        int a = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a++;
        }
        for (int i : array) {
            System.out.println(i);
        }
        ;

    }
}

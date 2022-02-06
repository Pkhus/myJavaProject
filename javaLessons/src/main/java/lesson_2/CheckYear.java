package lesson_2;

public class CheckYear {

       public static boolean checkYear(int a) {
        if (a % 4 == 0 && a % 100 == 0 && a % 400 != 0 || a % 4 != 0)
            return false;

        else return true;
    }
}

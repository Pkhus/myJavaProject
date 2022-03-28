package lesson_12;

public class PerTriangle {
    public static double AreaTriangle(int a, int b, int c) {
        if (a + b < c || b + c < a || a + c < b) {
            System.out.println("Данные стороны не образуют треугольник");
            System.exit(0);
        }
        double p1 = (a + b + c) / 2.0;
        // System.out.println(p1);
        double p2 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        System.out.println("Периметр треугольника = " + p2);

        return p2;
    }


    public static void main(String[] args) {

        AreaTriangle(4, 5, 6);


    }

}

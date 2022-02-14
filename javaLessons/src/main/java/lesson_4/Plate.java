package lesson_4;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int a) {
        food += a;
    }

    public void info() {
        System.out.println("В тарелке " + food);
    }

    boolean
    enoughFood(int n) {
        if (food - n >= 0) {
            food -= n;
            return true;
        }
        return false;
    }
}

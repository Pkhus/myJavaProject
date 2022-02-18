package lesson_4;

public class Cat extends Animal {
    int apetit;
    boolean Hungry;
    static int a = 0;

    public Cat(String name, int apetit) {
        super(name);
        this.apetit = apetit;
        this.Hungry = true;
        a++;
    }

    public void eat(Plate plate) {
        if (Hungry && plate.enoughFood(apetit))
            Hungry = false;
    }

    void info() {
        System.out.println(name + ": " + (Hungry ? "голоден" : "сыт"));
    }

    @Override
    public void run(int a) {
        if (a >= 0 && a <= 200) System.out.println(name + "пробежал: " + a + "м.");
        else
        System.out.println("Кот не может так много бегать");
    }

    @Override
    public void swim(int b) {
        System.out.println("Кот не умеет плавать");
    }

    static void countCat() {
        System.out.println("Создано котов: " + a);
    }

    public static void main(String args[]) {
        Cat[] cats = {new Cat("Barsik", 90), new Cat("Tom", 40), new Cat("Rizhik", 30), new Cat("Snezhok", 80)};
        Plate plate1 = new Plate(80);

        for (Cat a : cats
        ) {
            a.eat(plate1);
            a.info();
        }
        countCat();

    }


}

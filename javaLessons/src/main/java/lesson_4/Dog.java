package lesson_4;

public class Dog extends Animal {
    static int b = 0;

    public Dog(String name) {
        super(name);
        b++;
    }

    @Override
    public void run(int a) {
        if (a >= 0 && a <= 500) System.out.println(name + "  пробежал: " + a + "м.");
        else
        System.out.println("Собака не может так много бегать");
    }

    @Override
    public void swim(int b) {
        if (b >= 0 && b <= 10) System.out.println(name + "  проплыл: " + b + "м.");
        else
        System.out.println("Собака не может так много плавать");
    }

    static void countDog() {
        System.out.println("Созданно собак: " + b);
    }

    public static void main(String args[]) {
        Dog d=new Dog("hgjh");
        d.swim(5);


    }

}

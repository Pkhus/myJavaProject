package lesson_4;

public class Animal {
    String name;
    public Animal(String name){
        this.name=name;
    }
    public void run(int a){
        System.out.println("Животное пробежало: "+ a);
    }
    public void swim(int b){
        System.out.println("Животное проплыло: "+ b);
    }
}

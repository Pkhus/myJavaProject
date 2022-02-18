package lesson_3;

public class Employee {

    private String fio;
    private String posision;
    private String email;
    private int tel;
    private int salary;
    private int age;

    public Employee(String fio, String posision, String email, int tel, int salary, int age) {
        this.fio = fio;
        this.posision = posision;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void info() {

        System.out.println("Имя Фамилия: " + fio + "  Должность: " + posision + "  Email: " + email + "  телефон: " + tel + "  Зарплата: " + salary + "  Возраст: " + age);
    }
}




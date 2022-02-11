package lesson_3;

public class EmployeeArray {

    public static void main(String args[]) {

        Employee[] emArr = new Employee[5];

        emArr[0] = new Employee("Иванов Иван", "Инженер", "gsdfg@dfsad.ru", 566556557, 55000, 41);
        emArr[1] = new Employee("Петров Петр", "Юрист", "gsdfg1@dfsad.ru", 566556557, 40000, 35);
        emArr[2] = new Employee("Владимиров Владимир", "Снабженец", "gsdfg2@dfsad.ru", 566556557, 20000, 28);
        emArr[3] = new Employee("Семенов Семен", "Тестировщик", "gsdfg3@dfsad.ru", 566556557, 26000, 55);
        emArr[4] = new Employee("Федоров Федор", "Кладовщик", "gsdfg4@dfsad.ru", 566556557, 20000, 23);

        searchEmplyee(emArr);
    }

    public static void searchEmplyee(Employee[] arr) {
        for (Employee e : arr) if (e.getAge() > 40) e.info();
    }
}

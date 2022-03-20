package lesson_8;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = {"dog", "cat", "mouse", "lock", "mock", "lock", "pet", "mock", "mouse", "pet"};


        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");


        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");


        PhoneBook pb = new PhoneBook();

        pb.add("Ivanov", "123333");
        pb.add("Petrov", "456222");
        pb.add("Petrov", "789111");

        System.out.println(pb.get("Petrov"));
    }
}

package collectionInJava;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        // numbers.add(null); // ❌ Not allowed

        System.out.println("TreeSet (sorted): " + numbers);

        // Useful methods
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Higher than 25: " + numbers.higher(25));
        System.out.println("Lower than 25: " + numbers.lower(25));
    }
}

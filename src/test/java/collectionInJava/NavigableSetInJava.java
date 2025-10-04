package collectionInJava;

import java.util.TreeSet;

public class NavigableSetInJava {
    public static void main(String[] args) {
        TreeSet tsn=new TreeSet();
        tsn.add("10:15");
        tsn.add("12.30");
        tsn.add("06:45");
        tsn.add("07:30");
        tsn.add("09:20");
        tsn.add("15:45");
        tsn.add("20:20");
        System.out.println(tsn.floor("10:30"));
        System.out.println(tsn.ceiling("09:20"));
        System.out.println(tsn.higher("09:20"));
        System.out.println(tsn.pollFirst());
        System.out.println(tsn);
        System.out.println(tsn.pollLast());
        System.out.println(tsn);
        System.out.println(tsn.descendingSet());
        System.out.println(tsn);


    }
}

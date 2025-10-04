package collectionInJava;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetInJava {
    public static void main(String[] args) {
        Set<Integer> ts=new TreeSet<Integer>();
        ts.add(200);
        ts.add(10);
        ts.add(100);
        ts.add(45);
        System.out.println(ts);
    }
}

package collectionInJava;

import java.util.LinkedList;
import java.util.List;

public class LNKLIST {
    public static void main(String[] args) {
        List<Integer> lst= new LinkedList<Integer>();
        lst.add(10);
        lst.add(0,5);
        lst.add(15);
        lst.add(20);
        System.out.println(lst.contains(20));
        System.out.println(lst);
        System.out.println(lst.get(2));
        System.out.println(lst.isEmpty());
        lst.remove(0);
        System.out.println(lst);
        System.out.println(lst.get(2));

    }
}

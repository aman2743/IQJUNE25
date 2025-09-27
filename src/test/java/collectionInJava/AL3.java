package collectionInJava;

import java.util.ArrayList;
import java.util.List;

public class AL3 {
    public static void main(String[] args) {

        List<Integer> al3=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        al2.add(123);
        al2.add(234);
        al2.add(456);
        al3.add(300);
        al3.add(200);
        al3.addAll(al2);
        System.out.println(al3);
        System.out.println(al3.size());
        System.out.println("Object="+al3.get(2));
        System.out.println( al3.contains(201));
        System.out.println(al3.equals(200));
//        al3.clear();
        System.out.println(al3);
        System.out.println(al3.isEmpty());
        System.out.println(al3.indexOf(200));


    }
}

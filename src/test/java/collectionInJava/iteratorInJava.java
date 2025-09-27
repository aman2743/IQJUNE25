package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorInJava {
    public static void main(String[] args) {
        List<Integer> al3=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        al3.add(300);
        al3.add(200);
        al2.add(123);
        al2.add(234);
        al2.add(456);
        al3.addAll(al2);
//        System.out.println(al3);
        Iterator itr=al3.iterator();
        while(itr.hasNext()){
            Integer i=(Integer)itr.next();
            System.out.println(i+10);
        }

    }
}

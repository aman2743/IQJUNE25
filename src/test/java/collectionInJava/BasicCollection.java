package collectionInJava;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BasicCollection {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add('k');
        al.add(10);
        al.add("Java");
        al.add(null);
        al.add(0,'A');
        al.add(2,'B');
        al.remove(0);
        System.out.println(al);
        System.out.println(al.toString());



    }
}

package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorNew {
    public static void main(String[] args) {

        List<Integer> al3=new ArrayList<>();
        List<Integer> al4=new ArrayList<>();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        al3.add(4);
        al3.add(5);
        al3.add(6);
        al3.add(7);
        al3.add(8);
        al3.add(9);
        al3.add(10);

        Iterator<Integer> itr=al3.iterator();
        while(itr.hasNext()){
            Integer val=(Integer)(itr.next());
            if(val%2==0) {
            }
             else{
                itr.remove();
                }
            }
        System.out.println(al3);
        }
    }


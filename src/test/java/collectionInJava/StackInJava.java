package collectionInJava;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);;;;;;
        s.push(20);;;;;;
        s.push(30);;;;;
//        System.out.println(s.peek());
//        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search(10));


        Iterator<Integer> itr=s.iterator();
        while(itr.hasNext()){
            Integer i=itr.next();
            Integer x=i+10;
            System.out.println(x);
        }

    }
}

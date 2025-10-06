package mapInJava;

import java.util.*;

public class BasicMapProgram1 {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap();
        m.put(123,"Sobhit");
        m.put(234,"Rohit");
        m.put(345,"Shyam");
        m.put(456,"Ravi");
        m.put(567,"Sumit");
        Set<Integer> s=m.keySet();
        System.out.println(s);
       Collection<String> c= m.values();
        System.out.println(c);
        }

    }


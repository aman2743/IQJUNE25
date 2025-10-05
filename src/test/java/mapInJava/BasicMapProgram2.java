package mapInJava;

import java.util.*;

public class BasicMapProgram2 {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap();
        m.put(123,"Sobhit");
        m.put(234,"Rohit");
        m.put(345,"Shyam");
        m.put(456,"Ravi");
        m.put(567,"Sumit");
        Set<Map.Entry<Integer,String>> se=m.entrySet();
//        System.out.println(se);
        Iterator itr=se.iterator();
        while(itr.hasNext()){
            Map.Entry val = (Map.Entry) itr.next();
            System.out.println(val.getKey()+":"+val.getValue());
        }

    }
}

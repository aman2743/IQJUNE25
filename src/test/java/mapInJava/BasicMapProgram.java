package mapInJava;

import java.util.HashMap;
import java.util.Map;

public class BasicMapProgram {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap();
        m.put(123,"Sobhit");
        m.put(234,"Rohit");
        m.put(345,"Shyam");
        m.put(345,"Ravi");

        System.out.println(m);
        System.out.println(m.get(345));
//        m.remove(123);
        System.out.println(m);

        System.out.println(m.containsKey(234));
        System.out.println(m.containsValue("Rina"));
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        m.clear();
            System.out.println(m);
    }
}

package collectionInJava;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        Set st=new HashSet();
       st.add('A');
       st.add(10);
       st.add(10);
       st.add(200.45);
       st.add(null);
       st.add(null);
       System.out.println(st);



    }
}

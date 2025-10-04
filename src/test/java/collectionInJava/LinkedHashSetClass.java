package collectionInJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        Set st=new LinkedHashSet();
       st.add('A');
       st.add(10);
       st.add(10);
       st.add(200.45);
       st.add(null);
       st.add("Ramu");
       st.remove("Ramu");
       System.out.println(st);



    }
}

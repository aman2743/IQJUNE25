package mapInJava;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<Integer,String> map_var = new HashMap<>();
        map_var.put(1,"Neha");
        map_var.put(2,"Arun");
        map_var.put(3,"Sachin");
        map_var.put(4,"Rahul");
        map_var.put(5,"Anant");
        //System.out.println(map_var);

        System.out.println(map_var.get(1));
        System.out.println(map_var.remove(2));
        System.out.println(map_var);
        System.out.println(map_var.size());
        System.out.println(map_var.containsKey(3));
        System.out.println(map_var.containsValue("Neha"));
    }
}

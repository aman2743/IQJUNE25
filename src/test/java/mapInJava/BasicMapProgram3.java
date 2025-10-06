package mapInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BasicMapProgram3 {
    public static void main(String[] args) {
    String str ="HierarchyofCollectionFrameworkinJava";
    int len=str.length();
    int count;
    HashMap<Character,Integer> hm=new HashMap<>();
    for(int i=0;i<len;i++){
        char c=str.charAt(i);
        if(hm.containsKey(c)){
            count=hm.get(c);
            count++;
            hm.replace(c,count);
        }else
        {
            hm.put(c,1);
        }
     }
    for(Character ch: hm.keySet()){
        System.out.println(ch+":"+hm.get(ch));
    }
    }
}

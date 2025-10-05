package mapInJava;

import java.util.HashMap;

public class BasicMapProgram5 {
    public static void main(String[] args) {
    String str ="Hierarchy of Collection Framework in Java";
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
        if(hm.get(ch)==3){
            System.out.println(ch+":"+hm.get(ch));
        }
    }
    }
}

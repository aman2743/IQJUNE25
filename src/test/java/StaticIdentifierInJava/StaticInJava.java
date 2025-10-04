package StaticIdentifierInJava;

public class StaticInJava {
int roll_number;
String name;
static String collegeName="MPCT Gwalior";

public StaticInJava(int rn,String nm){
this.roll_number=rn;
this.name=nm;
}

public void print(){

    System.out.println("Name= "+name);
    System.out.println("Roll number= "+roll_number);
    System.out.println("College Name= "+collegeName);
}

    public static void main(String[] args) {
        System.out.println(StaticInJava.collegeName);

//        StaticInJava obj=new StaticInJava(1234,"Rohan");
//        obj.print();
    }
}

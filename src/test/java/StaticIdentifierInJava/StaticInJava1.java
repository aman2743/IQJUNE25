package StaticIdentifierInJava;

public class StaticInJava1 {
int roll_number;
String name;
static String collegeName="MPCT Gwalior";

public StaticInJava1(int rn, String nm){
this.roll_number=rn;
this.name=nm;
}

public void print(){

    System.out.println("Name= "+name);
    System.out.println("Roll number= "+roll_number);
    System.out.println("College Name= "+collegeName);
}

static void display(){
    System.out.println("inside display");
}

    public static void main(String[] args) {
        System.out.println(StaticInJava1.collegeName);
        StaticInJava1.display();
    }
}

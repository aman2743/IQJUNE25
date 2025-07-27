package oopsInJava;

public class Person {
    int unique_id;
    String name;
    int age;
    String city;
    char Gender;

    public void eat(){
        System.out.println("My age is "+age+" and "+"I eat at 8 PM");
    }
    public void study(){
        System.out.println("My city name is "+city+" and "+" I study 4 hours daily");
    }
    public void sleep(){
        System.out.println("My name is "+name+" and "+"I sleep at 10 PM");
    }
    public void play() {
        System.out.println("I play cricket");
    }

    public static void main(String[] args) {
        Person Sunaina=new Person();//Object
        Sunaina.age=20;
        Sunaina.name="Naina";
        Sunaina.city="Delhi";
        Sunaina.Gender='F';
        Sunaina.eat();
        Sunaina.play();
        Sunaina.study();
        Sunaina.sleep();
    }

}

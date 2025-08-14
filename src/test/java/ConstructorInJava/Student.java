package ConstructorInJava;

public class Student {
    String name;
    int age;
    String city;
    char Gender;
    public Student(String name,int age,String city,char Gender){
       this.name=name;
       this.age=age;
       this.city=city;
       this.Gender=Gender;
    }

    public void result(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        System.out.println(Gender);
    }

    public static void main(String[] args) {
        Student std=new Student("Naina",20,"Delhi",'F');//constructor
        std.result();
        System.out.println("inside main method");
    }
}

package AbstractionInJava;

abstract class vehicle{
    int no_of_tyres;
    abstract void start();
}

class car extends vehicle{

    @Override
    void start() {
        no_of_tyres=4;
        System.out.println("Number of Tyres ="+no_of_tyres+" and Car starts with Key");
    }
}

class bike extends vehicle{

    @Override
    void start() {
        no_of_tyres=2;
        System.out.println("Number of Tyres ="+no_of_tyres+" and Bike starts with Kick");
    }
}



public class AbstractImplementation {

    public static void main(String[] args) {
        car c= new car();
        c.start();

        bike b= new bike();
        b.start();

    }
}

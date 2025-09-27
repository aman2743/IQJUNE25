package interfaceInJava;
// Define an interface
interface Animal {
    // Abstract method (no body)
    void eat();
    void sleep();

    // Default method (with a body)
    default void describe() {
        System.out.println("This is an animal.");
    }

    // Static method (can be called directly on the interface)
    static void showSpecies() {
        System.out.println("Various animal species exist.");
    }
}
interface WildAnimal {
    // Abstract method (no body)
    void eat1();git push
    void sleep1();

    // Default method (with a body)
    default void describe1() {
        System.out.println("This is an animal.");
    }

    // Static method (can be called directly on the interface)
    static void showSpecies1() {
        System.out.println("Various animal species exist.");
    }
}

// Implement the interface in a class
class Dog implements Animal,WildAnimal {
    @Override
    public void eat() {
        System.out.println("Dog is eating kibble.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping soundly.");
    }

    @Override
    public void eat1() {

    }

    @Override
    public void sleep1() {

    }
}

// Main class to demonstrate the interface
public class InterfaceExample {
    public static void main(String[] args) {
        // Create an instance of the implementing class
        Dog myDog = new Dog();

        // Call methods defined in the interface
        myDog.eat();
        myDog.sleep();
        myDog.describe(); // Call the default method

        // Call the static method on the interface
        Animal.showSpecies();
    }
}


package Polymorphism;


/**
 * The type Animal.
 */
class Animal {
    /**
     * Sound.
     */
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

/**
 * The type Dog.
 */
class Dog extends Animal {
    /**
     * Sound.
     */
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

/**
 * The type Cat.
 */
class Cat extends Animal {
    /**
     * Sound.
     */
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

/**
 * The type Method overriding.
 */
public class MethodOverriding {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();  // Output: Dog barks
        animal2.sound();  // Output: Cat meows
    }
}

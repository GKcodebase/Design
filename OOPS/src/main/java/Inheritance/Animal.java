package Inheritance;

/**
 * The type Animal.
 */
// Class definition for Animal
class Animal {
    /**
     * Sound.
     */
    void sound() {
        System.out.println("Some generic sound");
    }
}

/**
 * The type Dog.
 */
// Class definition for Dog, subclass of Animal
class Dog extends Animal {
    /**
     * Sound.
     */
    @Override
    void sound() {
        System.out.println("Woof!");
    }
}

/**
 * The type Cat.
 */
// Class definition for Cat, subclass of Animal
class Cat extends Animal {
    /**
     * Sound.
     */
    @Override
    void sound() {
        System.out.println("Meow!");
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
// Main method
    public static void main(String[] args) {
        // Creating objects of subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling overridden methods
        dog.sound();  // Output: Woof!
        cat.sound();  // Output: Meow!

        Animal animal = new Animal();
        animal.sound();

        Animal patti = new Dog();
        patti.sound();

    }
}

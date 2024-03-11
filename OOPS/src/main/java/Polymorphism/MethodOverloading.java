package Polymorphism;

/**
 * The type Method overloading.
 */
public class MethodOverloading {
}

/**
 * The type Calculator.
 */
class Calculator {
    /**
     * Add int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
// Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Add int.
     *
     * @param a the a
     * @param b the b
     * @param c the c
     * @return the int
     */
// Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Add double.
     *
     * @param a the a
     * @param b the b
     * @return the double
     */
// Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
// Main method
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));          // Output: 15
        System.out.println(calc.add(5, 10, 15));      // Output: 30
        System.out.println(calc.add(3.5, 2.5));       // Output: 6.0
    }
}

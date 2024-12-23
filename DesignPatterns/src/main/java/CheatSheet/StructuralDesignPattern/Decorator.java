package CheatSheet.StructuralDesignPattern;

/**
 * The Decorator.
 */
public class Decorator {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " costs $" + myCoffee.getCost());

        // Add milk to the coffee
        myCoffee = new Milk(myCoffee);
        System.out.println(myCoffee.getDescription() + " costs $" + myCoffee.getCost());

        // Add sugar to the coffee
        myCoffee = new Sugar(myCoffee);
        System.out.println(myCoffee.getDescription() + " costs $" + myCoffee.getCost());

    }

    /**
     * The interface Coffee.
     */
// Base Component Interface
    interface Coffee {
        /**
         * Gets cost.
         *
         * @return the cost
         */
        double getCost();

        /**
         * Gets description.
         *
         * @return the description
         */
        String getDescription();
    }

    /**
     * The type Simple coffee.
     */
// Concrete Component
    static class SimpleCoffee implements Coffee {
        /**
         * Gets cost.
         *
         * @return the cost
         */
        @Override
        public double getCost() {
            return 5;
        }

        /**
         * Gets description.
         *
         * @return the description
         */
        @Override
        public String getDescription() {
            return "Simple Coffee";
        }
    }

    /**
     * The type Coffee decorator.
     */
    static class CoffeeDecorator implements Coffee {

        /**
         * The Decorated coffee.
         */
        protected Coffee decoratedCoffee;

        /**
         * Instantiates a new Coffee decorator.
         *
         * @param decoratedCoffee the decorated coffee
         */
        public CoffeeDecorator(Coffee decoratedCoffee) {
            this.decoratedCoffee = decoratedCoffee;
        }

        /**
         * Gets cost.
         *
         * @return the cost
         */
        @Override
        public double getCost() {
            return decoratedCoffee.getCost();
        }

        /**
         * Gets description.
         *
         * @return the description
         */
        @Override
        public String getDescription() {
            return decoratedCoffee.getDescription();
        }
    }

    /**
     * The type Milk.
     */
    static class Milk extends CoffeeDecorator {

        /**
         * Instantiates a new Milk.
         *
         * @param decoratedCoffee the decorated coffee
         */
        public Milk(Coffee decoratedCoffee) {
            super(decoratedCoffee);
        }

        /**
         * Gets cost.
         *
         * @return the cost
         */
        @Override
        public double getCost() {
            return super.getCost() + 2;
        }

        /**
         * Gets description.
         *
         * @return the description
         */
        @Override
        public String getDescription() {
            return super.getDescription() + ", Milk";
        }
    }

    /**
     * The type Sugar.
     */
    static class Sugar extends CoffeeDecorator {

        /**
         * Instantiates a new Sugar.
         *
         * @param decoratedCoffee the decorated coffee
         */
        public Sugar(Coffee decoratedCoffee) {
            super(decoratedCoffee);
        }

        /**
         * Gets cost.
         *
         * @return the cost
         */
        @Override
        public double getCost() {
            return super.getCost() + 1;
        }

        /**
         * Gets description.
         *
         * @return the description
         */
        @Override
        public String getDescription() {
            return super.getDescription() + ", Sugar";
        }
    }
}

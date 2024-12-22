package CheatSheet.CreationalDesignPattern;

/**
 * The Builder.
 */
public class Builder {

    /**
     * The Pizza.
     */
    Pizza pizza = new Pizza.PizzaBuilder()
            .dough("thin")
            .sauce("tomato")
            .topping("cheese")
            .build();

    /**
     * The type Pizza.
     */
    static class Pizza {
        /**
         * The Crust.
         */
        private String crust;
        /**
         * The Sauce.
         */
        private String sauce;
        /**
         * The Toppings.
         */
        private String toppings;

        /**
         * Instantiates a new Pizza.
         *
         * @param builder the builder
         */
        private Pizza(PizzaBuilder builder) {

        }

        /**
         * The type Pizza builder.
         */
        public static class PizzaBuilder {
            /**
             * The Dough.
             */
            private String dough;
            /**
             * The Sauce.
             */
            private String sauce;
            /**
             * The Topping.
             */
            private String topping;

            /**
             * Dough pizza builder.
             *
             * @param dough the dough
             * @return the pizza builder
             */
            public PizzaBuilder dough(String dough) {
                this.dough = dough;
                return this;
            }

            /**
             * Sauce pizza builder.
             *
             * @param sauce the sauce
             * @return the pizza builder
             */
            public PizzaBuilder sauce(String sauce) {
                this.sauce = sauce;
                return this;
            }

            /**
             * Topping pizza builder.
             *
             * @param topping the topping
             * @return the pizza builder
             */
            public PizzaBuilder topping(String topping) {
                this.topping = topping;
                return this;
            }

            /**
             * Build pizza.
             *
             * @return the pizza
             */
            public Pizza build() {
                return new Pizza(this);
            }
        }
    }
}

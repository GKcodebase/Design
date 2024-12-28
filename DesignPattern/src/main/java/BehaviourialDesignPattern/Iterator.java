package BehaviourialDesignPattern;

/**
 * The Iterator.
 */
public class Iterator {
    /**
     * The interface Iterators.
     *
     * @param <T> the type parameter
     */
    interface Iterators<T> {
        /**
         * Has next boolean.
         *
         * @return the boolean
         */
        boolean hasNext();

        /**
         * Next t.
         *
         * @return the t
         */
        T next();
    }

    /**
     * The interface Container.
     *
     * @param <T> the type parameter
     */
    interface Container<T> {
        /**
         * Gets iterator.
         *
         * @return the iterator
         */
        Iterators<T> getIterator();
    }

    /**
     * The type Name repository.
     */
    class NameRepository implements Container<String> {

        /**
         * The Names.
         */
        private final String[] names = {"John", "Alice", "Bob", "Eve"};
        /**
         * The Name iterator.
         */
        private Iterators<String> NameIterator;


        /**
         * The type Name iterator.
         */
        private class NameIterator implements Iterators<String> {
            /**
             * The Index.
             */
            private int index;

            /**
             * Has next boolean.
             *
             * @return the boolean
             */
            @Override
            public boolean hasNext() {
                return index < names.length;
            }

            /**
             * Next string.
             *
             * @return the string
             */
            @Override
            public String next() {
                if (hasNext()) {
                    return names[index++];
                }
                return null;
            }
        }

        /**
         * Gets iterator.
         *
         * @return the iterator
         */
        @Override
        public Iterators<String> getIterator() {
            return NameIterator;
        }
    }
}

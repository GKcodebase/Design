package CheatSheet.CreationalDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The Prototype.
 */
public class Prototype {

    /**
     * The interface Proto type.
     */
// Prototype Interface
    interface ProtoType extends Cloneable{
        /**
         * Clone proto type.
         *
         * @return the proto type
         * @throws CloneNotSupportedException the clone not supported exception
         */
        ProtoType clone() throws CloneNotSupportedException;
    }

    /**
     * The type Complex object.
     */
// Concrete Prototype
    class ComplexObject implements ProtoType{
        /**
         * The Data.
         */
        private List<String> data;

        /**
         * Instantiates a new Complex object.
         */
        public ComplexObject() {
            data = new ArrayList<>();
        }

        /**
         * Instantiates a new Complex object.
         *
         * @param original the original
         */
// Deep copy constructor
        public ComplexObject(ComplexObject original) {
            this.data = new ArrayList<>(original.data);
        }

        /**
         * Clone proto type.
         *
         * @return the proto type
         * @throws CloneNotSupportedException the clone not supported exception
         */
        @Override
        public ProtoType clone() throws CloneNotSupportedException {
            return new ComplexObject(this);
        }
    }
}

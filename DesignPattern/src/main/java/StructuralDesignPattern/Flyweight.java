package StructuralDesignPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * The Flyweight.
 */
public class Flyweight {

    /**
     * The interface Tree.
     */
// Flyweight Interface
    interface Tree {
        /**
         * Render.
         *
         * @param x the x
         * @param y the y
         */
        void render(int x, int y);
    }

    /**
     * The type Tree type.
     */
// Concrete Flyweight
    class TreeType implements Tree {

        /**
         * The Name.
         */
        private final String name;
        /**
         * The Color.
         */
        private final String color;

        /**
         * Instantiates a new Tree type.
         *
         * @param name  the name
         * @param color the color
         */
        public TreeType(String name, String color) {
            this.name = name;
            this.color = color;
        }

        /**
         * Render.
         *
         * @param x the x
         * @param y the y
         */
        @Override
        public void render(int x, int y) {
            System.out.println("Rendering " + color + " " + name + " tree at (" + x + "," + y + ")");
        }
    }

    /**
     * The type Tree factory.
     */
// Flyweight Factory
    class TreeFactory {
        /**
         * The Tree types.
         */
        private final Map<String, TreeType> treeTypes = new HashMap<>();

        /**
         * Gets tree type.
         *
         * @param name  the name
         * @param color the color
         * @return the tree type
         */
        public TreeType getTreeType(String name, String color) {
            TreeType type = treeTypes.get(name + color);
            if (type == null) {
                type = new TreeType(name, color);
                treeTypes.put(name + color, type);
            }
            return type;
        }

    }
}

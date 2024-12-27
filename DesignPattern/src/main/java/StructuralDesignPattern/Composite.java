package StructuralDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The  Composite.
 */
public class Composite {
    /**
     * The interface File system component.
     */
// Component Interface
    interface FileSystemComponent {
        /**
         * Display.
         */
        void display();

        /**
         * Gets size.
         *
         * @return the size
         */
        long getSize();
    }

    /**
     * The type File.
     */
// Leaf Component
    class File implements FileSystemComponent {

        /**
         * The Name.
         */
        private String name;
        /**
         * The Size.
         */
        private long size;

        /**
         * Display.
         */
        @Override
        public void display() {
            System.out.println("File: " + name);
        }

        /**
         * Gets size.
         *
         * @return the size
         */
        @Override
        public long getSize() {
            return size;
        }
    }

    /**
     * The type Directory.
     */
// Composite Component
    class Directory implements FileSystemComponent {

        /**
         * The Name.
         */
        private final String name;
        /**
         * The Components.
         */
        private final List<FileSystemComponent> components;

        /**
         * Instantiates a new Directory.
         *
         * @param name the name
         */
        public Directory(String name) {
            this.name = name;
            this.components = new ArrayList<>();

        }

        /**
         * Add.
         *
         * @param component the component
         */
        public void add(FileSystemComponent component) {
            components.add(component);
        }

        /**
         * Remove.
         *
         * @param component the component
         */
        public void remove(FileSystemComponent component) {
            components.remove(component);
        }

        /**
         * Display.
         */
        @Override
        public void display() {
            System.out.println("Directory: " + name);
            for (FileSystemComponent component : components) {
                component.display();
            }
        }

        /**
         * Gets size.
         *
         * @return the size
         */
        @Override
        public long getSize() {
            return components.stream()
                    .mapToLong(FileSystemComponent::getSize)
                    .sum();
        }
    }
}

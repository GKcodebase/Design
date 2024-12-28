package StructuralDesignPattern;

/**
 * The Proxy.
 */
public class Proxy {
    /**
     * The interface Image.
     */
// Subject Interface
    interface Image {
        /**
         * Display.
         */
        void display();
    }

    /**
     * The type Real image.
     */
// Real Subject
    class RealImage implements Image {
        /**
         * The File name.
         */
        private String fileName;

        /**
         * Instantiates a new Real image.
         *
         * @param fileName the file name
         */
        public RealImage(String fileName) {
            this.fileName = fileName;
            loadFromDisk();
        }

        /**
         * Load from disk.
         */
        private void loadFromDisk() {
            System.out.println("Loading " + fileName);
        }

        /**
         * Display.
         */
        @Override
        public void display() {
            System.out.println("Displaying " + fileName);
        }
    }

    /**
     * The type Proxy image.
     */
//Proxy
    class ProxyImage implements Image {
        /**
         * The Real image.
         */
        private RealImage realImage;
        /**
         * The File name.
         */
        private String fileName;

        /**
         * Instantiates a new Proxy image.
         *
         * @param fileName the file name
         */
        public ProxyImage(String fileName) {
            this.fileName = fileName;
        }

        /**
         * Display.
         */
        @Override
        public void display() {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
    }
}

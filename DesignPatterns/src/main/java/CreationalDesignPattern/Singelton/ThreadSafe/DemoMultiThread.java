package CreationalDesignPattern.Singelton.ThreadSafe;

/**
 * The type Demo multi thread.
 */
public class DemoMultiThread {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadBar = new Thread(new ThreadBar());
        Thread threadFoo = new Thread(new ThreadFoo());
        threadFoo.start();
        threadBar.start();
    }

    /**
     * The type Thread foo.
     */
    static class ThreadFoo implements Runnable {
        /**
         * Run.
         */
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    /**
     * The type Thread bar.
     */
    static class ThreadBar implements Runnable {
        /**
         * Run.
         */
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}

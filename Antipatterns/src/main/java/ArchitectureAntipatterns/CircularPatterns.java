package ArchitectureAntipatterns;

public class CircularPatterns {
    // Antipattern
    class A {
        private B b;
    }

    class B {
        private A a;  // Circular dependency
    }

    // Better Solution
    interface AInterface {
        void doSomething();
    }

    class Aa implements AInterface {
        private Bb b;

        @Override
        public void doSomething() {

        }
    }

    class Bb {
        private AInterface a;  // Depends on interface
    }
}

package StructuralDesignPattern;

/**
 * The Facade.
 */
public class Facade {

    /**
     * The type Cpu.
     */
// Complex Subsystem Classes
    class CPU {
        /**
         * Freeze.
         */
        public void freeze() {
            System.out.println("CPU: Freezing");
        }

        /**
         * Jump.
         *
         * @param position the position
         */
        public void jump(long position) {
            System.out.println("CPU: Jumping to " + position);
        }

        /**
         * Execute.
         */
        public void execute() {
            System.out.println("CPU: Executing");
        }
    }

    /**
     * The type Memory.
     */
    class Memory {
        /**
         * Load.
         *
         * @param position the position
         * @param data     the data
         */
        public void load(long position, byte[] data) {
            System.out.println("Memory: Loading data at " + position);
        }
    }

    /**
     * The type Hard drive.
     */
    class HardDrive {
        /**
         * Read byte [ ].
         *
         * @param lba  the lba
         * @param size the size
         * @return the byte [ ]
         */
        public byte[] read(long lba, int size) {
            System.out.println("Hard Drive: Reading " + size + " bytes at " + lba);
            return new byte[size];
        }
    }

    /**
     * The type Computer facade.
     */
// Facade
    class ComputerFacade {
        /**
         * The Cpu.
         */
        private final CPU cpu;
        /**
         * The Memory.
         */
        private final Memory memory;
        /**
         * The Hard drive.
         */
        private final HardDrive hardDrive;


        /**
         * Instantiates a new Computer facade.
         *
         * @param cpu       the cpu
         * @param memory    the memory
         * @param hardDrive the hard drive
         */
        public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
            this.cpu = cpu;
            this.memory = memory;
            this.hardDrive = hardDrive;
        }

        /**
         * Start.
         */
        public void start() {
            cpu.freeze();
            memory.load(0, hardDrive.read(0, 1024));
            cpu.jump(10);
            cpu.execute();
        }
    }
}

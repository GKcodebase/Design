package CheatSheet.BehaviourialDesignPattern;

/**
 * The Command.
 */
public class Command {
    /**
     * The interface Commands.
     */
//Command Interface
    interface Commands {
        /**
         * Execute.
         */
        void execute();

        /**
         * Undo.
         */
        void undo();
    }

    /**
     * The type Light.
     */
//Receiver
    class Light {
        /**
         * Turn on.
         */
        public void turnOn() {
            System.out.println("Light is on");
        }

        /**
         * Turn off.
         */
        public void turnOff() {
            System.out.println("Light is off");
        }
    }

    /**
     * The type Light on command.
     */
//Concrete Command
    class LightOnCommand implements Commands {
        /**
         * The Light.
         */
        private final Light light;

        /**
         * Instantiates a new Light on command.
         *
         * @param light the light
         */
        public LightOnCommand(Light light) {
            this.light = light;
        }

        /**
         * Execute.
         */
        @Override
        public void execute() {
            light.turnOn();
        }

        /**
         * Undo.
         */
        @Override
        public void undo() {
            light.turnOn();
        }
    }

    /**
     * The type Light off command.
     */
    class LightOffCommand implements Commands {
        /**
         * The Light.
         */
        private final Light light;

        /**
         * Instantiates a new Light off command.
         *
         * @param light the light
         */
        public LightOffCommand(Light light) {
            this.light = light;
        }

        /**
         * Execute.
         */
        @Override
        public void execute() {
            light.turnOff();
        }

        /**
         * Undo.
         */
        @Override
        public void undo() {
            light.turnOn();
        }

    }

    /**
     * The type Remote control.
     */
//Invoker
    class RemoteControl {
        /**
         * The Command.
         */
        private Commands command;

        /**
         * Sets command.
         *
         * @param command the command
         */
        public void setCommand(Commands command) {
            this.command = command;
        }

        /**
         * Press button.
         */
        public void pressButton() {
            command.execute();
        }

        /**
         * Press undo button.
         */
        public void pressUndoButton() {
            command.undo();
        }
    }
}

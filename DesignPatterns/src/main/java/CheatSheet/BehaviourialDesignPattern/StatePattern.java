package CheatSheet.BehaviourialDesignPattern;

/**
 * The State pattern.
 */
public class StatePattern {

    /**
     * The interface State.
     */
    interface State {
        /**
         * Handle.
         */
        void handle();
    }

    /**
     * The type Ready state.
     */
// Concrete States
    class ReadyState implements State {

        /**
         * Handle.
         */
        @Override
        public void handle() {
            System.out.println("Media player is ready");
        }
    }

    /**
     * The type Playing state.
     */
    class PlayingState implements State {

        /**
         * Handle.
         */
        @Override
        public void handle() {
            System.out.println("Media player is playing");
        }
    }

    /**
     * The type Paused state.
     */
    class PausedState implements State {

        /**
         * Handle.
         */
        @Override
        public void handle() {
            System.out.println("Media player is paused");
        }
    }

    /**
     * The type Media player.
     */
//Context Class
    class MediaPlayer {
        /**
         * The State.
         */
        private State state;

        /**
         * Sets state.
         *
         * @param state the state
         */
        public void setState(State state) {
            this.state = state;
        }

        /**
         * Perform action.
         */
        public void performAction() {
            state.handle();
        }
    }
}

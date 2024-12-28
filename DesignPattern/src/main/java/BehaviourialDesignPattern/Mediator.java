package BehaviourialDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The Mediator.
 */
public class Mediator {

    /**
     * The interface Chat mediator.
     */
// Mediator Interface
    interface ChatMediator {
        /**
         * Send message.
         *
         * @param message the message
         * @param user    the user
         */
        void sendMessage(String message, User user);

        /**
         * Add user.
         *
         * @param user the user
         */
        void addUser(User user);
    }

    /**
     * The type User.
     */
    abstract class User {
        /**
         * The Mediator.
         */
        protected ChatMediator mediator;
        /**
         * The Name.
         */
        protected String name;

        /**
         * Instantiates a new User.
         *
         * @param mediator the mediator
         * @param name     the name
         */
        public User(ChatMediator mediator, String name) {
            this.mediator = mediator;
            this.name = name;
        }

        /**
         * Send.
         *
         * @param message the message
         */
        public abstract void send(String message);

        /**
         * Receive.
         *
         * @param message the message
         */
        public abstract void receive(String message);
    }

    /**
     * The type Chat room.
     */
    class ChatRoom implements ChatMediator {

        /**
         * The Users.
         */
        private final List<User> users;

        /**
         * Instantiates a new Chat room.
         */
        public ChatRoom() {
            this.users = new ArrayList<>();
        }

        /**
         * Send message.
         *
         * @param message the message
         * @param user    the user
         */
        @Override
        public void sendMessage(String message, User user) {
            for (User u : users) {
                if (u != user) {
                    u.receive(message);
                }
            }
        }

        /**
         * Add user.
         *
         * @param user the user
         */
        @Override
        public void addUser(User user) {
            users.add(user);

        }
    }

    /**
     * The type Chat user.
     */
// Concrete Colleagues
    class ChatUser extends User {

        /**
         * Instantiates a new Chat user.
         *
         * @param mediator the mediator
         * @param name     the name
         */
        public ChatUser(ChatMediator mediator, String name) {
            super(mediator, name);
        }

        /**
         * Send.
         *
         * @param message the message
         */
        @Override
        public void send(String message) {
            System.out.println(name + " is sending message: " + message);
            mediator.sendMessage(message, this);
        }

        /**
         * Receive.
         *
         * @param message the message
         */
        @Override
        public void receive(String message) {
            System.out.println(name + " received: " + message);

        }
    }
}

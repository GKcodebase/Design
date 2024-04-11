package SOLID;


/**
 * High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
 * **/

public class DependencyInversion {
    // Example violating DIP
    class EmailService {
        public void sendEmail(String message, String recipient) {
            // Code to send email
        }
    }

    class UserManager {
        private final EmailService emailService;

        public UserManager() {
            this.emailService = new EmailService();
        }

        public void sendWelcomeEmail(String user) {
            emailService.sendEmail("Welcome!", user);
        }
    }

    // Refactored with abstraction
    interface MessageService {
        void sendMessage(String message, String recipient);

        void sendEmail(String s, String user);
    }

    class EmailServiceRefactored implements MessageService {
        @Override
        public void sendMessage(String message, String recipient) {
            // Code to send email
        }

        @Override
        public void sendEmail(String s, String user) {

        }
    }

    class UserManagerRefactored {
        private MessageService messageService;

        public void UserManager(MessageService messageService) {
            this.messageService = messageService;
        }

        UserManagerRefactored(MessageService messageService) {
            this.messageService = messageService;
        }

        public void sendWelcomeMessage(String user) {
            messageService.sendMessage("Welcome!", user);
        }
    }

}

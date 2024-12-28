package CodeAntipatterns;

import java.util.logging.Logger;

public class GodObjects {

    // Antipattern
    class UserManager {
        private Database db;
        private EmailService emailService;
        private PaymentProcessor paymentProcessor;
        private Logger logger;

        public void createUser() { /* ... */ }
        public void processPayment() { /* ... */ }
        public void sendEmail() { /* ... */ }
        public void generateReports() { /* ... */ }
        // Too many responsibilities
    }

    // Better Solution - Single Responsibility
    class UserService {
        private UserRepository userRepository;

        public void createUser() { /* ... */ }
    }

    class PaymentService {
        private PaymentProcessor paymentProcessor;

        public void processPayment() { /* ... */ }
    }
}

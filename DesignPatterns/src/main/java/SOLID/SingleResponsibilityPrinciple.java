package SOLID;

public class SingleResponsibilityPrinciple {
    // Example violating SRP
    class Employee {
        public void calculatePay() {
            // Code to calculate pay
        }

        public void saveEmployeeData() {
            // Code to save employee data to database
        }
    }

    // Refactored classes adhering to SRP
    class PayCalculator {
        public void calculatePay() {
            // Code to calculate pay
        }
    }

    class EmployeeDataSaver {
        public void saveEmployeeData() {
            // Code to save employee data to database
        }
    }

}

package SOLID;

/***
 * A class should have only one reason to change, meaning it should have only one responsibility.
 * */
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

package CodeAntipatterns;

public class CopyPaste {

    // Antipattern
    void processStudent() {
        validateName();
        validateAge();
        validateEmail();
    }

    void processTeacher() {
        validateName();  // Duplicated code
        validateAge();   // Duplicated code
        validateEmail(); // Duplicated code
    }

    // Better Solution
    abstract class Person {
        void process() {
            validateName();
            validateAge();
            validateEmail();
        }
    }

    class Student extends Person { }
    class Teacher extends Person { }
}

package ExceptionHandlingAntipatterns;

public class CatchAndIgnore {
    public static void main(String args[]){
        // Antipattern
        try {
           // riskyOperation();
        } catch (Exception e) {
            // Empty catch block
        }



        // Better Solution
        try {
            //riskyOperation();
        } catch (Exception e) {
            logger.error("Error during risky operation", e);
            throw new ServiceException("Operation failed", e);
        }
    }
}

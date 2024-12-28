package CodeAntipatterns;

public class MagicNumber {

    public static void main(String args[]){
        int status =0;
        int amount =100;

        // Antipattern
        if (status == 1) {
            calculateDiscount(amount * 0.15);
        }

        // Better Solution
        if (status == OrderConstants.STATUS_ACTIVE) {
            calculateDiscount(amount * OrderConstants.STANDARD_DISCOUNT);
        }
    }

    // Better Solution
    public class OrderConstants {
        public static final int STATUS_ACTIVE = 1;
        public static final double STANDARD_DISCOUNT = 0.15;
    }

    private static void calculateDiscount(double v) {
    }


}

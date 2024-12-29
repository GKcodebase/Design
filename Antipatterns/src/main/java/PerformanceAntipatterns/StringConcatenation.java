package PerformanceAntipatterns;

public class StringConcatenation {
    public static void main(String args[]){
        char data[]  = { 'a','e','i','o','u'};
        // Antipattern
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += data[i];  // Creates new String object each time
        }


        // Better Solution
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(data[i]);
        }
        String finalResult = sb.toString();
    }
}

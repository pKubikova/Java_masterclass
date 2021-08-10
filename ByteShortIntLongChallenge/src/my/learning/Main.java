package my.learning;

public class Main {

    public static void main(String[] args) {

        byte byteNumber = 120;
        short shortNumber = 12345;

        int intNumber = 45678;
        long longNumber = 50000L + 10L* (byteNumber + shortNumber + intNumber);
        System.out.println(longNumber);

    }
}

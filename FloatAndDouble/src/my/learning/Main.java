package my.learning;

public class Main {

    public static void main(String[] args) {

        float floatMinNumber = Float.MIN_VALUE; //minimalna hodnota pre float number
        float floatMaxNumber = Float.MAX_VALUE; // max hodnota pre float number
        System.out.println(floatMinNumber);
        System.out.println(floatMaxNumber);

        double doubleMinNumber = Double.MIN_VALUE;
        double doubleMaxNumber = Double.MAX_VALUE;//max hodnota pre double number
        System.out.println(doubleMinNumber);
        System.out.println(doubleMaxNumber);

        int mojIntegerHodnota = 5 / 3;
        float mojFloatHodnota = 5f / 3f;
        double mojDoubleHodnota = 5.00 / 3.00; // pri deleni cislom 3 uvidime mnoho viac des.miest s
        //vacsou presnostou, 2x takou ako je hodnota float number.
        System.out.println("moja integer hodnota " + mojIntegerHodnota);
        System.out.println("moja float hodnota " + mojFloatHodnota);
        System.out.println("moja double hodnota " + mojDoubleHodnota);

        //challenge
        double vlozeneCisloVPounds = 5d;
        double vysledokVKilogramoch = vlozeneCisloVPounds * 0.45359237d;
        System.out.println("vysledok v kilogramoch je " + vysledokVKilogramoch);
    }
}

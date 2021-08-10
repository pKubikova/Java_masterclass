package my.learning;

public class Main {

    public static void main(String[] args) {

         char mojZnak = 'D';
         char mojZnakVUnicode = '\u0044';
         /* Unicode je tabulka kde kazdy znak,cislica,charakter ma svoju unikatnu cislicu,
         ktora sa da vyuzit v premennej char.
          */
        System.out.println(mojZnak);
        System.out.println(mojZnakVUnicode);
        char znakCopyright = '\u00A9';  //mal by to byt znak copyright
        boolean mojaPravdivaHodnota = true;
        boolean mojaNepravdivaHodnota = false;

        boolean isCustomerOverTwentyOne = true;
    }
}

package my.learning;

public class Main {

    public static void main(String[] args) {

        String myString = "this is a string";
        System.out.println("Moj retazec je rovny: " + myString);
        myString = myString + " a toto je naviac.";
        System.out.println("moj retazec je rovny: " + myString);
        String ciselnyString = "1234";
        ciselnyString = ciselnyString + "789";
        System.out.println(ciselnyString);
        String mojRetazec = "10";
        int myInt = 50;
        mojRetazec= mojRetazec + myInt;
        System.out.println(" moj retazec bude vyzerat takto: " + mojRetazec);
        // na 17 riadku spajam integer/cislo ku stringu a tak mi to cislo pripise nakoniec a vznikne tiez jednoliaty
        //retazec/text "1050." Je to podobne ako keby som spajala ciselny string + ciselny string, tiez s text zleje dohromady.
        double doubleNumber = 121.47d;
        mojRetazec= mojRetazec + doubleNumber;
        System.out.println("moj retazec je rovny: " + mojRetazec);
        // aj desatinne cislo dat.typ double Java automaticky konvertne to retazca a tak mi vznikne: 1050121.47,
        //pretoze sa to tiez cele zleje dohromady ako text.
        StringBuffer meno = new StringBuffer("jnuhyni");
        meno.append("toto je ");
        System.out.println(meno);
        meno.append("lala");
        System.out.println(meno);
        meno.append(1000);
        System.out.println(meno);

        meno.delete(0,4);
        System.out.println(meno);

    }
}

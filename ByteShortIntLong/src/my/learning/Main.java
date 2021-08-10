package my.learning;

public class Main {

    public static void main(String[] args) {


        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimalna hodnota pre integer = " + myMinIntValue);
        System.out.println("Maximalna hodnota pre integer = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimalna hodnota pre byte = " + myMinByteValue);
        System.out.println("Maximalna hodnota pre byte = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimalna hodnota pre short = " + myMinShortValue);
        System.out.println("Maximalna hodnota pre short = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimalna hodnota pre long = "+ myMinLongValue);
        System.out.println("Maximalna hodnota pre long = "+ myMaxLongValue);

        int myTotal = (myMinIntValue /2);
        // pojde tov pohode, pretoze 2 je integer a aj minimalna hodnota ktoru chceme delit sme
        //zadali ze bude integer, takze aj nove cislo bude dat.typ integer.

        //byte myNewByteValue = (myMinByteValue / 2);  //vyhodi chybu a je to podciarknute,
        //pretoze cislo 2 je integer a ja chcem vydelit Byte dvojkou a chcem aby vzniklo
        //nove Byte cislo, ale kedze 2 je integer , najprv sa vydeli cislo ktore bude tym padom
        //integer, a potom sa snazi to zmenit a napchat do Byte a to nejde.

        /*Prave v tomto pripade, ked chcem aby to delenie fungovalo normalne a nekonvertovalo to na
        integer, tak pouzijem "Casting" co zmanema  zmenu z jedneho datoveho typu na iny.
        Mozem ale pri tom prist o data pretoze sa bude vzdy ukladat len maximalna mozna ciselna
        hodnota.
         */
        // Casting ukazka ako by som vyriesila error vyssie:
        byte myNewByteValue1 = (byte)  (myMinByteValue / 2); //dopisala som (byte)

        byte nonCorrectValue = (byte) 1000;
        System.out.println(nonCorrectValue);


    }
}

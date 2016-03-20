package org.axhm3a.java;

/**
 * Created by axhm3a on 13.03.16.
 */
public class Rekursion extends MiniJava
{
    public static void main(String [] args) {
        int ergebnis = eingabe(0);
        System.out.println(ergebnis); //AUSGABE
    }

    public static int eingabe (int zaehler) {
        if (zaehler == 3) {
            return 0;
        }

        int ergebnis = eingabe(zaehler +1);

        if (zaehler % 2 == 0) {
            ergebnis += readInt("Addition"); //EINGABE / VERARBEITUNG
        } else {
            ergebnis -= readInt("Subtraktion"); //EINGABE / VERARBEITUNG
        }

        return ergebnis;
    }
}

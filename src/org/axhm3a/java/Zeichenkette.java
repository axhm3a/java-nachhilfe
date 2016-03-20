package org.axhm3a.java;

public class Zeichenkette extends MiniJava{

    public static void main(String[] args) {
        //variablen deklaration
        String gesamtText;
        String zeichenKette;
        int index = -1;

        //eingabe
        gesamtText = readString("Bitte den Gesamttext eingeben.");  //haystack
        zeichenKette = readString("Bitte gesuchte Zeichenkette eingeben."); //needle

        //verarbeitung
        for (int i = 0; i < gesamtText.length(); i++) {

            for (int n = 0; n < zeichenKette.length(); n++) {

                if (gesamtText.charAt(i + n) != zeichenKette.charAt(n)) {
                    break;
                }

                if(n + 1== zeichenKette.length()) {
                    index = i;
                }
            }
        }

        //ausgabe
        write(index);
    }
}

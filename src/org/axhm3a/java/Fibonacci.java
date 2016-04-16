package org.axhm3a.java;

/**
 * Created by axhm3a on 21.03.16.
 */
public class Fibonacci extends MiniJava {
    public static void main(String[] args) {

        int ermittelteZahl = fibonacci(0);
        write(ermittelteZahl);
    }


    public static int fibonacci(int stelle) {
        stelle = readInt();

        if(stelle == 0) {
            return 0; }
        else if (stelle == 1) {
            return 1;  }
        else {
            return fibonacci(stelle-1) + fibonacci(stelle-2);
        }

    }
}



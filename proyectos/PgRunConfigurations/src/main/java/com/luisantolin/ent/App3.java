package com.luisantolin.ent; 

public class App3 {
    public static void main( String[] args ) {
    	System.out.println("Soy la clase App3");
        for ( int i = 0 ; i < args.length ; i++ ) {
            System.out.print( i + ": [" + args[i] + "] | " );
        }
    }
}

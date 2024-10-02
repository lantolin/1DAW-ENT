package com.luisantolin.ent; 

public class App {
    public static void main( String[] args ) {
    	System.out.println("Soy la clase App");
        for ( int i = 0 ; i < args.length ; i++ ) {
            System.out.print( i + ": [" + args[i] + "]\n" );
        }
    }
}

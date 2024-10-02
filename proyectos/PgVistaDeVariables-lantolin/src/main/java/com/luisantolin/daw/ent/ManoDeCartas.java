package com.luisantolin.daw.ent;

public class ManoDeCartas {
    private String[] mano;

    public ManoDeCartas() {
        mano = new String[4];
        
        for ( int i = 0 ; i < mano.length ; i++ ) {
            mano[i] = "";
        }
    }

    public void cogerCarta( String carta ) {
        for ( int i = 0 ; i < mano.length ; i++ ) {
            if ( mano[i] == "" ) {
                mano[i] = carta;
                System.out.println( "He cogido la carta: " + carta );
                return;
            }
        }

        System.out.println( "Mano completa no puedes tomar mas cartas" );
    }

    public void soltarCarta( int numCarta ) {
        if ( numCarta < mano.length && numCarta >= 0 ) {
            System.out.println( "Soltando la carta: " + mano[numCarta] );
            mano[numCarta] = "";
            return;
        }
        System.err.println("Indice incorrecto.");

    }
}

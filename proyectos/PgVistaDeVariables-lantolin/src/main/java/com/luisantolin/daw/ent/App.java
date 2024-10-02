package com.luisantolin.daw.ent;

public class App 
{
    public static void main( String[] args )
    {
        ManoDeCartas mano = new ManoDeCartas();
        
        mano.cogerCarta( "as de oros" );
        mano.cogerCarta( "as de copas" );
        mano.cogerCarta( "as de bastos" );
        mano.cogerCarta( "as de espadas" );
        mano.cogerCarta( "dos de espadas" );
        
        mano.soltarCarta( 0 );
        mano.soltarCarta( 1 );
        mano.soltarCarta( 2 );
        mano.soltarCarta( 3 );
        mano.soltarCarta( -1 );
    }
}

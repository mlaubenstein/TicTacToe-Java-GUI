package de.Marvin;

import javax.swing.*;

public class TicTacToeFrame extends JFrame {

    /**
     * formatting the display window
     */
    TicTacToeFrame(){

        setTitle ( "TicTacToe mal anders ?" );
        setSize  ( 10,10 );


        TicTacToePanel tttpanel = new TicTacToePanel ();
            add ( tttpanel );
            pack ();






    }




}

package de.Marvin;

import javax.swing.*;

public class PlayerChooseFrame extends JFrame {

    PlayerChooseFrame(){

        setTitle ( "TicTacToe mal anders" );
        setSize ( 10,10 );


        PlayerChoosePanel panel = new PlayerChoosePanel ();
        add(panel);
        pack ();


    }
}

package de.Marvin;

import javax.swing.*;

public class ChooseFrame extends JFrame {

    ChooseFrame(){

        setTitle ( "TicTacToe mal anders" );
        setSize ( 10,10 );


        PlayerChoosePanel panel = new PlayerChoosePanel ();
        add(panel);
        pack ();


    }
}

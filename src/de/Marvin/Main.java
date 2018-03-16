package de.Marvin;

import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Main {

    public static void main (String[] args) {

        PlayerChoosePanel panel = new PlayerChoosePanel ();
        PlayerChooseFrame frame = new PlayerChooseFrame ();
        TicTacToeFrame tttframe = new TicTacToeFrame ();

        {
            frame.setVisible ( true );
            frame.setDefaultCloseOperation ( EXIT_ON_CLOSE );

        }while (panel.getPlayerchoose () == 1);

            frame.setVisible ( false );
            tttframe.setVisible ( true );
            tttframe.setDefaultCloseOperation ( EXIT_ON_CLOSE );



    }
}

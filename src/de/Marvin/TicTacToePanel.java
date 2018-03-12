package de.Marvin;

import javax.swing.*;
import java.awt.*;

public class TicTacToePanel extends JPanel {

   private JPanel panel;

    TicTacToePanel(){

        panel = new JPanel (  );
        panel.setLayout ( new GridLayout ( 3,3 ) );


            JButton fieldOne = new JButton ();
            add ( fieldOne );
            JButton fieldTwo = new JButton ();
            add ( fieldTwo );
            JButton fieldThree = new JButton ();
            add ( fieldThree );
            JButton fieldFour = new JButton ();
            add ( fieldFour );
            JButton fieldFive = new JButton ();
            add ( fieldFive );
            JButton fieldSix = new JButton ();
            add ( fieldSix );
            JButton fieldSeven = new JButton ();
            add ( fieldSeven );
            JButton fieldEight = new JButton ();
            add ( fieldEight );
            JButton fieldNine = new JButton ();
            add ( fieldNine );


        add(panel, BorderLayout.CENTER);





    }



}

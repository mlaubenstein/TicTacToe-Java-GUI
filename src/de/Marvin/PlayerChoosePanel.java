package de.Marvin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayerChoosePanel extends JPanel {

    private JTextField display;
    private JPanel TicTacToe;
    private JButton playerOne;
    private JButton playerTwo;
    private int choose = 0;


    PlayerChoosePanel(){


        setLayout ( new BorderLayout ());

        display = new JFormattedTextField ( "Choose Player" );

        add(display, BorderLayout.NORTH);


        playerOne = new JButton ("Player 1");
        playerOne.addActionListener ( new ActionPlayer1 () );
        add(playerOne, BorderLayout.WEST);


        playerTwo = new JButton ("Player 2");
        playerTwo.addActionListener ( new ActionPlayer2 () );
        add(playerTwo, BorderLayout.EAST);
    }


    public class ActionPlayer1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

             display.setText ( "Player 1 starts" );
             setplayerchoose ( 1 );
        }
    }
    public class ActionPlayer2 implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){

            display.setText ( "Player 2 starts" );
            setplayerchoose ( 2 );
        }
    }

    public void setplayerchoose(int playerchoose){
        choose =  playerchoose;
    }
    public int getPlayerchoose (){
        return choose;
    }

}



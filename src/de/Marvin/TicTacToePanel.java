package de.Marvin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TicTacToePanel extends JPanel {

    public List<Integer> fieldStatus = new ArrayList<> ( );
    private JPanel panel;
    private JTextField Status;
    private JButton fieldOne;
    private JButton fieldTwo;
    private JButton fieldThree;
    private JButton fieldFour;
    private JButton fieldFive;
    private JButton fieldSix;
    private JButton fieldSeven;
    private JButton fieldEight;
    private JButton fieldNine;

    StatusField statusField = new StatusField ();
    SettingSymbolPlayer settingSymbolPlayer = new SettingSymbolPlayer ();

    /**
     * Create Buttons for the TicTacToe fields, tag them with ActionListener
     * and add them to the panel shown in the centre of the display window
     */
    TicTacToePanel(){

        //filling the fieldStatus list with 0 from 0 to 9
        for (int i = 0; i<=9; i++) {
            fieldStatus.add ( 0 );
        }

        panel = new JPanel (  );
        //using the GridLayout <= just a 3x3 field filled with buttons
        panel.setLayout ( new GridLayout ( 3,3 ) );

        /*
        creating the JButtons for each Button
        creating ActionListener for each Button
        adding Button to panel (GridLayout)
        */
            fieldOne = new JButton ();
            fieldOne.addActionListener ( new ActionFieldOne() );
            panel.add( fieldOne );
            fieldTwo = new JButton ();
            fieldTwo.addActionListener ( new ActionFieldTwo() );
            panel.add( fieldTwo );
            fieldThree = new JButton ();
            fieldThree.addActionListener ( new ActionFieldThree() );
            panel.add ( fieldThree );
            fieldFour = new JButton ();
            fieldFour.addActionListener ( new ActionFieldFour() );
            panel.add ( fieldFour );
            fieldFive = new JButton ();
            fieldFive.addActionListener ( new ActionFieldFive() );
            panel.add ( fieldFive );
            fieldSix = new JButton ();
            fieldSix.addActionListener ( new ActionFieldSix() );
            panel.add ( fieldSix );
            fieldSeven = new JButton ();
            fieldSeven.addActionListener ( new ActionFieldSeven() );
            panel.add ( fieldSeven );
            fieldEight = new JButton ();
            fieldEight.addActionListener ( new ActionFieldEight() );
            panel.add ( fieldEight );
            fieldNine = new JButton ();
            fieldNine.addActionListener ( new ActionFieldNine() );
            panel.add ( fieldNine );



        add(panel, BorderLayout.CENTER);




    }

    /**
     * The ActionEvents for each ActionListener
     */
    private class ActionFieldOne implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 1 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 1 ) == 1) {
                fieldOne.setText ( "x" );
            }else if(fieldStatus.get ( 1 ) == 2){
                fieldOne.setText ( "o");
            }

        }
    }
    private class ActionFieldTwo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 2 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 2 ) == 1) {
                fieldTwo.setText ( "x" );
            }else if(fieldStatus.get ( 2 ) == 2){
                fieldTwo.setText ( "o");
            }


        }
    }
    private class ActionFieldThree implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 3 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 3 ) == 1) {
                fieldThree.setText ( "x" );
            }else if(fieldStatus.get ( 3 ) == 2){
                fieldThree.setText ( "o");
            }
        }
    }
    private class ActionFieldFour implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 4 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 4 ) == 1) {
                fieldFour.setText ( "x" );
            }else if(fieldStatus.get ( 4 ) == 2){
            fieldFour.setText ( "o");
            }
        }
    }
    private class ActionFieldFive implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 5 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 5 ) == 1) {
                fieldFive.setText ( "x" );
            }else if(fieldStatus.get ( 5 ) == 2){
                fieldFive.setText ( "o");
            }
        }
    }
    private class ActionFieldSix implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 6 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 6 ) == 1) {
                fieldSix.setText ( "x" );
            }else if(fieldStatus.get ( 6 ) == 2){
                fieldSix.setText ( "o");
            }
        }
    } private class ActionFieldSeven implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 7 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 7 ) == 1) {
                fieldSeven.setText ( "x" );
            }else if(fieldStatus.get ( 7 ) == 2){
                fieldSeven.setText ( "o");
            }
        }
    }
    private class ActionFieldEight implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 8 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 8 ) == 1) {
                fieldEight.setText ( "x" );
            }else if(fieldStatus.get ( 8 ) == 2){
                fieldEight.setText ( "o");
            }
        }
    }
    private class ActionFieldNine implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            statusField.Input ( 9 );
            for (Integer ListElement : settingSymbolPlayer.GettingSymbolPlayer ()){
                fieldStatus.add ( ListElement );
            }
            if (fieldStatus.get ( 9 ) == 1) {
                fieldNine.setText ( "x" );
            }else if(fieldStatus.get ( 9 ) == 2){
                fieldNine.setText ( "o");
            }

        }
    }
}

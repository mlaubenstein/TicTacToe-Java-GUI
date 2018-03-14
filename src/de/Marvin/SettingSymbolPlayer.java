package de.Marvin;

import java.util.ArrayList;
import java.util.List;

public class SettingSymbolPlayer {
    public List<Integer> SymbolSet = new ArrayList<> ();
    public List<Integer> SymbolGet = new ArrayList<> ();
    private int pressedField;
    private int firstRound = 0;


    /**
     * decides if it is the turn of PlayerOne or PlayerTwo
     * @param fieldPressed
     * becomes the local variable pressedField, needed to
     * sign the clicked file with X or O
     */
    public void PlayerOneOrTwo(int fieldPressed){

        ListInitial ();
        pressedField = fieldPressed;
        if (SymbolSet.get ( 0 ) == 1){
            SettingSymbolPlayer1 ();
        }else if (SymbolSet.get ( 0 ) == 0){
            SettingSymbolPlayer2 ();
        }
        GetSymbolPlayer(SymbolSet);


    }

    /**
     * filling the SymbolSet ArrayList in the first round
     * so it could be changed in every turn
     */
    public void ListInitial(){

        if ( firstRound == 0){
            for ( int i = 0; i<=9 ; i++ ){
                SymbolSet.add ( 0 );
            }
            firstRound++;
        }
    }

    public List<Integer> SettingSymbolPlayer1(){
        SymbolSet.set (0,0);

        switch (pressedField){
            case 1: SymbolSet.set ( 1,1 );break;
            case 2: SymbolSet.set ( 2,1 );break;
            case 3: SymbolSet.set ( 3,1 );break;
            case 4: SymbolSet.set ( 4,1 );break;
            case 5: SymbolSet.set ( 5,1 );break;
            case 6: SymbolSet.set ( 6,1 );break;
            case 7: SymbolSet.set ( 7,1 );break;
            case 8: SymbolSet.set ( 8,1 );break;
            case 9: SymbolSet.set ( 9,1 );break;
        }
        return SymbolSet;
    }
    public List<Integer> SettingSymbolPlayer2(){

        SymbolSet.set (0,1);


        switch (pressedField){
            case 1: SymbolSet.set ( 1,2 );break;
            case 2: SymbolSet.set ( 2,2 );break;
            case 3: SymbolSet.set ( 3,2 );break;
            case 4: SymbolSet.set ( 4,2 );break;
            case 5: SymbolSet.set ( 5,2 );break;
            case 6: SymbolSet.set ( 6,2 );break;
            case 7: SymbolSet.set ( 7,2 );break;
            case 8: SymbolSet.set ( 8,2 );break;
            case 9: SymbolSet.set ( 9,2 );break;
        }
        return SymbolSet;
    }

    private void GetSymbolPlayer(List<Integer> symbolSet) {
        SymbolGet.clear ();
        for (Integer ListElement : symbolSet){
            SymbolGet.add ( ListElement );
        }
    }
    public List<Integer> GettingSymbolPlayer(){
        return SymbolGet;
    }

}

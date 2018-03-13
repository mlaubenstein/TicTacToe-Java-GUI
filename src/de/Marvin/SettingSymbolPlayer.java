package de.Marvin;

import java.util.ArrayList;
import java.util.List;

public class SettingSymbolPlayer {
    public List<Integer> SymbolSet = new ArrayList<> ();
    public List<Integer> SymbolGet = new ArrayList<> ();
    private int pressedField;
    private int firstRound = 0;



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

    public void ListInitial(){

        if ( firstRound == 0){
            for ( int i = 0; i<=9 ; i++ ){
                SymbolSet.add ( 0 );
            }
            firstRound++;
        }
    }

    public List<Integer> SettingSymbolPlayer1(){
        SymbolSet.add(0,1);

        switch (pressedField){
            case 1: SymbolSet.add ( 1,1 );
            case 2: SymbolSet.add ( 2,1 );
            case 3: SymbolSet.add ( 3,1 );
            case 4: SymbolSet.add ( 4,1 );
            case 5: SymbolSet.add ( 5,1 );
            case 6: SymbolSet.add ( 6,1 );
            case 7: SymbolSet.add ( 7,1 );
            case 8: SymbolSet.add ( 8,1 );
            case 9: SymbolSet.add ( 9,1 );
        }
        return SymbolSet;
    }
    public List<Integer> SettingSymbolPlayer2(){

        SymbolSet.add(0,2);


        switch (pressedField){
            case 1: SymbolSet.add ( 1,2 );
            case 2: SymbolSet.add ( 2,2 );
            case 3: SymbolSet.add ( 3,2 );
            case 4: SymbolSet.add ( 4,2 );
            case 5: SymbolSet.add ( 5,2 );
            case 6: SymbolSet.add ( 6,2 );
            case 7: SymbolSet.add ( 7,2 );
            case 8: SymbolSet.add ( 8,2 );
            case 9: SymbolSet.add ( 9,2 );
        }
        return SymbolSet;
    }

    private void GetSymbolPlayer(List<Integer> symbolSet) {
        for (Integer ListElement : symbolSet){
            SymbolGet.add ( ListElement );
        }
    }
    public List<Integer> GettingSymbolPlayer(){
        return SymbolGet;
    }

}

package de.Marvin;

public class TicTacToeAnzeige {
    SettingSymbolPlayer settingSymbolPlayer = new SettingSymbolPlayer ();
    private int temp;

    public String TicTacToePlayerTurn() {

        return "Start";

    }

    public String setPlayer (){

       if(settingSymbolPlayer.getSymbolSet () == 1) {

           temp = 1;

       }else if (settingSymbolPlayer.getSymbolSet () == 0){

           temp = 2;
       }

        return "Spieler"+temp;
    }
}

package de.Marvin;

import java.util.*;

public class StatusField {
    private List<Boolean> AlreadyPressed = new ArrayList<> ();
    private SettingSymbolPlayer settingSymbolPlayer = new SettingSymbolPlayer ();


    public void Input( int fieldPressed) {

        for( int i = 0; i<=9; i++ ){
        AlreadyPressed.add(false);
        }


        AlreadyPressed.add ( 0, true );

        if (fieldPressed == 1) {
            AlreadyPressed.add ( 1, true );
        }
        else if (fieldPressed == 2) {
            AlreadyPressed.add ( 2, true );
        }
        else if (fieldPressed == 3) {
            AlreadyPressed.add ( 3, true );
        }
        else if (fieldPressed == 4) {
            AlreadyPressed.add ( 4, true );
        }
        else if (fieldPressed == 5) {
            AlreadyPressed.add ( 5, true );
        }
        else if (fieldPressed == 6) {
                AlreadyPressed.add ( 6, true );
        }
        else if (fieldPressed == 7) {
            AlreadyPressed.add ( 7, true );
        }
        else if (fieldPressed == 8 ) {
            AlreadyPressed.add ( 8, true );
        }
        else if ( fieldPressed == 9) {
            AlreadyPressed.add ( 9, true );
        }

         settingSymbolPlayer.PlayerOneOrTwo (fieldPressed);

    }




}

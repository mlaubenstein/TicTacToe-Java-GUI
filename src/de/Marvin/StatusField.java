package de.Marvin;

import java.util.*;

public class StatusField {
    private List<Boolean> AlreadyPressed = new ArrayList<> ();
    private SettingSymbolPlayer settingSymbolPlayer = new SettingSymbolPlayer ();


    /**
     * Checking if the field is already pressed
     * @param fieldPressed
     * passes the pressed field passed from the ActionListener
     */
    public void Input( int fieldPressed) {

        for( int i = 0; i<=9; i++ ){
        AlreadyPressed.add(false);
        }


        AlreadyPressed.set( 0, true );

        if (fieldPressed == 1) {
            AlreadyPressed.set ( 1, true );
        }
        else if (fieldPressed == 2) {
            AlreadyPressed.set ( 2, true );
        }
        else if (fieldPressed == 3) {
            AlreadyPressed.set ( 3, true );
        }
        else if (fieldPressed == 4) {
            AlreadyPressed.set ( 4, true );
        }
        else if (fieldPressed == 5) {
            AlreadyPressed.set ( 5, true );
        }
        else if (fieldPressed == 6) {
                AlreadyPressed.set ( 6, true );
        }
        else if (fieldPressed == 7) {
            AlreadyPressed.set ( 7, true );
        }
        else if (fieldPressed == 8 ) {
            AlreadyPressed.set ( 8, true );
        }
        else if ( fieldPressed == 9) {
            AlreadyPressed.set ( 9, true );
        }

         settingSymbolPlayer.PlayerOneOrTwo (fieldPressed);


    }

    public List<Integer> SymbolGet() {
        return settingSymbolPlayer.GettingSymbolPlayer ();
    }
}

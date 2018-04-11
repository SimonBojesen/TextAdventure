/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class TextAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c = new Controller();
        TUI tui = new TUI();
        
        Room startroom = c.mapGen();
        Player p = c.playerGen(startroom);

        tui.gameStart(p);

        while (true){
            tui.getRoomDescription(p);
            ArrayList<String> movements = c.getMoveOptions(p);
            int i = tui.getPlayerInput(movements);
            
            switch (i) {
                case 1: 
                    p.setCurrentRoom(p.getCurrentRoom().getNorth());
                    break;
                case 2: 
                    p.setCurrentRoom(p.getCurrentRoom().getEast());
                    break;
                case 3:
                    p.setCurrentRoom(p.getCurrentRoom().getSouth());
                    break;
                case 4: 
                    p.setCurrentRoom(p.getCurrentRoom().getWest());
                    break;
                    
            }
        }
            
        
    }
    
}

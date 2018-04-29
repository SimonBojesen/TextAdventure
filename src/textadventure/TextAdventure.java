/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import gamelogic.Controller;
import gamelogic.TUI;
import superclasses.Room;
import superclasses.Player;

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

        //this is the gameloop
        while (!c.getWinConditon(p) && !p.isIsDead()) {
            c.checkCombat(p, tui);
            if (!p.isIsDead()) {
                c.move(p, tui);
            }
            
        }
    }
}

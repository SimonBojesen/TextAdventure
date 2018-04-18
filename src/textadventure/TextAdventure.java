/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;


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
        c.move(p, tui);   
    }
    
}

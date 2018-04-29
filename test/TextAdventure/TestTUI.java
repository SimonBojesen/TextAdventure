/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;


import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon
 */
public class TestTUI {
    
    @Test
    public void testWest(){
        superclasses.Room C4 = new superclasses.Room("C4","Start");
        superclasses.Room C3 = new superclasses.Room("C3","Slut");
        C4.setWest(C3);
        superclasses.Player p = new superclasses.Player(C4);
        p.setCurrentRoom(C4);
        gamelogic.Controller c = new gamelogic.Controller();
        ArrayList<String> movements = c.getMoveOptions(p);
        
        if (movements.contains("Press 4 to go West")) {
            p.setCurrentRoom(C3);
        }
        
        assertEquals("Slut", p.getCurrentRoom().getDescription());
    }
    
    @Test
    public void testEast(){
        superclasses.Room C4 = new superclasses.Room("C4","Start");
        superclasses.Room C3 = new superclasses.Room("C3","Slut");
        C4.setEast(C3);
        superclasses.Player p = new superclasses.Player(C4);
        p.setCurrentRoom(C4);
        gamelogic.Controller c = new gamelogic.Controller();
        ArrayList<String> movements = c.getMoveOptions(p);
        if (movements.contains("Press 2 to go East")) {
            p.setCurrentRoom(C3);
        }
        assertEquals("Slut", p.getCurrentRoom().getDescription());
    }
    
    @Test
    public void testNorth(){
        superclasses.Room C4 = new superclasses.Room("C4","Start");
        superclasses.Room C3 = new superclasses.Room("C3","Slut");
        C4.setNorth(C3);
        superclasses.Player p = new superclasses.Player(C4);
        p.setCurrentRoom(C4);
        gamelogic.Controller c = new gamelogic.Controller();
        ArrayList<String> movements = c.getMoveOptions(p);
        if (movements.contains("Press 1 to go North")) {
            p.setCurrentRoom(C3);
        }
        assertEquals("Slut", p.getCurrentRoom().getDescription());
    }
    
    @Test
    public void testSouth(){
        superclasses.Room C4 = new superclasses.Room("C4","Start");
        superclasses.Room C3 = new superclasses.Room("C3","Slut");
        C4.setSouth(C3);
        superclasses.Player p = new superclasses.Player(C4);
        p.setCurrentRoom(C4);
        gamelogic.Controller c = new gamelogic.Controller();
        ArrayList<String> movements = c.getMoveOptions(p);
        if (movements.contains("Press 3 to go South")) {
            p.setCurrentRoom(C3);
        }
        assertEquals("Slut", p.getCurrentRoom().getDescription());
    }
    
}

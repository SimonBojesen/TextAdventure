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
public class Controller {
    private ArrayList<Room> rooms = new ArrayList();
    
    
    public Room mapGen() {
        Room A2 = new Room("A2 - roperoom","You walk into a `seemingly´ empty room.");
        Room A3 = new Room("A3","");
        Room A4 = new Room("A4 - Startroom","");
        Room A5 = new Room("A5","");
        
        Room B3 = new Room("B3","");
        Room B4 = new Room("B4","");
        Room B5 = new Room("B5","");
        Room B6 = new Room("B6","");
        
        Room C2 = new Room("C2 - GateKeeper","You walk into a bigass room lit with fire.\n In the middle of the the room is a HUUUGE Dragon with hair like Donald Trump.\n It quickly feels your presence, and sends his minion politicians after you.");
        Room C3 = new Room("C3","");
        Room C4 = new Room("C4","");
        Room C5 = new Room("C5","");
        Room C6 = new Room("C6","");
        
        Room D2 = new Room("D2 - WellRoom","In the middle of this new room there is a well. It looks hundreds of years old.");
        Room D3 = new Room("D3","");
        Room D4 = new Room("D4","");
        Room D5 = new Room("D5","");
        Room D6 = new Room("D6","");
        
        Room E1 = new Room("E1 - BigBoss Donald Trump","You have finally reached the BigBoss Donald Trump Dragon! Good Job! The dragon breathes out flames, telling you to come at him.\nHope you are ready for this. FIGHT.");
        Room E2 = new Room("E2","This room has an eerie feeling to it.");
        Room E3 = new Room("E3","");
        Room E4 = new Room("E4","");
        Room E6 = new Room("E6","");
        
        rooms.add(A2);
        rooms.add(A3);
        rooms.add(A4);
        rooms.add(A5);
        rooms.add(B3);
        rooms.add(B4);
        rooms.add(B5);
        rooms.add(B6);
        rooms.add(C2);
        rooms.add(C3);
        rooms.add(C4);
        rooms.add(C5);
        rooms.add(C6);
        rooms.add(D2);
        rooms.add(D3);
        rooms.add(D4);
        rooms.add(D5);
        rooms.add(D6);
        rooms.add(E1);
        rooms.add(E2);
        rooms.add(E3);
        rooms.add(E4);
        rooms.add(E6);
        
        A2.setEast(A3);
        
        A3.setWest(A2);
        A3.setSouth(B3);
        A3.setEast(A4);
        
        A3.setWest(A2);
        A3.setSouth(B3);
        A3.setEast(A4);
        
        A4.setWest(A3);
        A4.setSouth(B4);
        A4.setEast(A5);
        
        A5.setWest(A4);
        A5.setSouth(B5);
        
        B3.setNorth(A3);
        B3.setEast(B4);
        
        B4.setNorth(A4);
        B4.setWest(B3);
        B4.setSouth(C4);
        B4.setEast(B5);
        
        B5.setNorth(A5);
        B5.setWest(B4);
        B5.setSouth(C5);

        B6.setSouth(C6);
        
        C2.setEast(C3);
        
        C3.setWest(C2);
        C3.setEast(C4);
        
        C4.setNorth(B4);
        C4.setWest(C3);
        C4.setSouth(D4);
        C4.setEast(C5);
        
        C5.setNorth(B5);
        C5.setWest(C4);
        C5.setSouth(D5);
        C5.setEast(C6);
        
        C6.setNorth(B6);
        C6.setWest(C5);
        C6.setSouth(D6);
        
        D2.setSouth(E2);
        D2.setEast(D3);
        
        D3.setWest(D2);
        D3.setEast(D4);
        
        D4.setNorth(C4);
        D4.setWest(D3);
        
        D5.setNorth(C5);
        
        D6.setNorth(C6);
        D6.setSouth(E6);
        
        E1.setEast(E2);
        
        E2.setNorth(D2);
        E2.setWest(E1);
        E2.setEast(E3);
        
        E3.setWest(E2);
        E3.setEast(E4);
        
        E4.setNorth(D4);
        E4.setWest(E3);
        
        E6.setNorth(D6);
        
        return A4;
    }
    
    public Player playerGen(Room startroom) {
        Player player = new Player(startroom);  
        return player;
    }
    
    public ArrayList<String> getMoveOptions(Player p) {
        ArrayList<String> movements = new ArrayList();
        if (p.getCurrentRoom().getNorth() != null) {
            movements.add("Press 1 to go North");
        }
        if (p.getCurrentRoom().getEast() != null) {
            movements.add("Press 2 to go East");
        }
        if (p.getCurrentRoom().getSouth() != null) {
            movements.add("Press 3 to go South");
        }
        if (p.getCurrentRoom().getWest() != null) {
            movements.add("Press 4 to go West");
        }
        return movements;
    }  
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.util.ArrayList;

/**
 *
 * @author Simon, Arik, Rasmus Porse
 */
public class Player {
    private String name = "Player";
    private int health = 100;
    private Room currentRoom;
    private int exp;
    
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        
    }
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}

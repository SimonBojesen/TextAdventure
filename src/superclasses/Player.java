/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclasses;

import superclasses.Item;
import java.util.ArrayList;
/**
 *
 * @author Simon, Arik, Rasmus Porse
 */
public class Player {
    private String name = "Player";
    private int baseHealth = 100;
    private int baseDmg = 10;
    private Room currentRoom;
    private ArrayList<Item> inventory;

    public ArrayList<Item> getInventory() {
        return inventory;
    }
    
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        inventory = new ArrayList();
    }
    public int getHealth() {
        return baseHealth;
    }
    public String getName() {
        return name;
    }
    public void setHealth(int health) {
        this.baseHealth = health;
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    public void addItemToInventory(Item i) {
        this.inventory.add(i);
    }
    public void removeItemFromInventory(Item i) {
        this.inventory.remove(i);
    }
    
    public int getBaseDmg() {
        return baseDmg;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }
}

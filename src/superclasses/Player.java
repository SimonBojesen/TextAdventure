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
 * @author Simon
 */
public class Player {
    private String name = "Player";
    private int baseHealth = 100;
    private int baseDmg = 10;
    private int currentDmg;
    private boolean isDead = false; 

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
    public int getCurrentDmg() {
        return currentDmg;
    }

    public void setCurrentDmg(int currentDmg) {
        this.currentDmg = currentDmg;
    }
    private Room currentRoom;
    private Item equip;

    public int getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public Item getEquip() {
        return equip;
    }

    public void setEquip(Item equip) {
        this.equip = equip;
    }
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

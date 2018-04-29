/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclasses;

/**
 *
 * @author Simon
 */
public class Monster {
    private String name;
    private String description;
    private int health;
    private int dmg;

    public Monster(String name, String description, int health, int dmg) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    
}

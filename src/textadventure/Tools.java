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
public class Tools extends Item {
    
    private int experience;

    public Tools(int experience, String name, String Description) {
        super(name, Description);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
   
    public void incExp(Player p){
        p.setExp(experience);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclasses;

import superclasses.Item;

/**
 *
 * @author Simon
 */
public class Obstacles extends Item {
    private Item useThisToRemoveObstacle;

    public Item getUseThisToRemoveObstacle() {
        return useThisToRemoveObstacle;
    }

    public void setUseThisToRemoveObstacle(Item useThisToRemoveObstacle) {
        this.useThisToRemoveObstacle = useThisToRemoveObstacle;
    }
    public Obstacles(String name, String description) {
        super(name, description);
    }
    
}

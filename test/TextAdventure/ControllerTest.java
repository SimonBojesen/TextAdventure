/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

import gamelogic.Controller;
import superclasses.Item;
import superclasses.Player;
import superclasses.Room;
import org.junit.Test;
import static org.junit.Assert.*;
import superclasses.Obstacles;

/**
 *
 * @author Simon
 */
public class ControllerTest {
    
    /**
     * Test of exploreLogic method, of class Controller.
     */
    @Test
    public void testExploreLogicMethod() {
        System.out.println("exploreLogic");
        Controller instance = new Controller();
        Room startroom = instance.mapGen();
        Player p = instance.playerGen(startroom);
        int startInventory = p.getInventory().size();
        int expNumItemsBeforePickup = 0;
        int expNumItemsAfterPickup = 1;
        //moves to nearest room with item in it
        p.setCurrentRoom(p.getCurrentRoom().getWest());
        //adds item to room
        Item currentRoomItem = p.getCurrentRoom().getItem();
        //picks up item
        p.addItemToInventory(currentRoomItem);
        int currentNumItems = p.getInventory().size();
        assertEquals(startInventory, expNumItemsBeforePickup);
        assertEquals(expNumItemsAfterPickup, currentNumItems);
    }

    /**
     * Test of useItem method, of class Controller.
     */
    @Test
    public void testUseItemMethod() {
        System.out.println("UseItem");
        Controller instance = new Controller();
        Room startroom = instance.mapGen();
        Player p = instance.playerGen(startroom);
        int expNumItemsAfterUse = 0;
        int expNumItemsAfterPickup = 1;
        
        //moves to nearest room with item in it
        p.setCurrentRoom(p.getCurrentRoom().getWest());

        //adds item to room
        Item currentRoomItem = p.getCurrentRoom().getItem();

        //picks up item
        p.addItemToInventory(currentRoomItem);

        int inventoryAfterPickup = p.getInventory().size();
        
        //moves to room where i can use the item
        p.setCurrentRoom(p.getCurrentRoom().getEast());
        p.setCurrentRoom(p.getCurrentRoom().getEast());
        p.setCurrentRoom(p.getCurrentRoom().getSouth());
        p.setCurrentRoom(p.getCurrentRoom().getSouth());
        p.setCurrentRoom(p.getCurrentRoom().getSouth());

        //finds obstacles in room
        Obstacles obs = p.getCurrentRoom().getObstacle();
        
        //uses item in inventory to remove obstacle
        if (obs.getUseThisToRemoveObstacle().equals(p.getInventory().get(0))) {
            p.getCurrentRoom().getItem().setAccess(true);
            p.removeItemFromInventory(p.getInventory().get(0));
        }
        
        //checks if the item you used it removed from the inventory
        int currentNumItems = p.getInventory().size();
        assertEquals(expNumItemsAfterPickup, inventoryAfterPickup);
        assertEquals(expNumItemsAfterUse, currentNumItems);
    }
}

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
public class Room {
    private String roomName;
    private String description;
    
    private Room north;
    private Room south;
    private Room west;
    private Room east;
    private boolean access = true;
    private Item item;
    private Obstacles obstacle;
    private Monster monster;
    private Item useThisToAccessRoom;

    public Item getUseThisToAccessRoom() {
        return useThisToAccessRoom;
    }

    public void setUseThisToAccessRoom(Item useThisToAccessRoom) {
        this.useThisToAccessRoom = useThisToAccessRoom;
    }

    public Obstacles getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacles obstacle) {
        this.obstacle = obstacle;
    }
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }
    
    public Room(String roomName, String description) {
        this.roomName = roomName;
        this.description = description;
    }
    
    public String getRoomName() {
        return roomName;
    }
    
    public Room getNorth() {
        return north;
    }
    
    public void setNorth(Room north) {
        this.north = north;
    }
    
    public Room getSouth() {
        return south;
    }
    
    public void setSouth(Room south) {
        this.south = south;
    }
    
    public Room getWest() {
        return west;
    }
    
    public void setWest(Room west) {
        this.west = west;
    }
    
    public Room getEast() {
        return east;
    }
    
    public void setEast(Room east) {
        this.east = east;
    }
    
    public String getDescription() {
        return description;
    }

    public boolean isAccess() {
        return access;
    }
    
    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}

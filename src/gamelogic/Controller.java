/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelogic;

import superclasses.Room;
import superclasses.Player;
import superclasses.Item;
import java.util.ArrayList;
import java.util.Random;
import superclasses.Monster;
import superclasses.Obstacles;

public class Controller {
    ArrayList<Room> rooms = new ArrayList();
    public Room mapGen() {

        Item rope = new Item("Rope", "You find a rope");
        Item stone = new Item("Stone", "You find a stone");
        Item scroll = new Item("Scroll", "You find a chest");
        Item pickaxe = new Item("Pickaxe", "You find a pickaxe");
        Item sword = new Item("Well", "You find a sword");
        Item key = new Item("Key", "You find an old key");
        Item pot1 = new Item("Small HealthPotion", "You found a small healthpotion");
        Item pot2 = new Item("HealthPotion", "You found a healthpotion");
        Item pot3 = new Item("Big HealthPotion", "You found a big healthpotion");

        rope.setItemType("consumable");
        stone.setItemType("consumable");
        scroll.setItemType("consumable");
        pickaxe.setItemType("consumable");
        sword.setItemType("equipable");
        sword.setStatUp(10);
        key.setItemType("consumable");
        pot1.setItemType("consumable");
        pot1.setStatUp(25);
        pot2.setItemType("consumable");
        pot2.setStatUp(50);
        pot3.setItemType("consumable");
        pot3.setStatUp(100);

        Obstacles chest = new Obstacles("chest", "The chest is locked");
        Obstacles vase = new Obstacles("vase", "Its an ancient vase made of clay.");
        Obstacles well = new Obstacles("well", "the well is so deep you can't even see the bottom.");

        chest.setUseThisToRemoveObstacle(key);
        vase.setUseThisToRemoveObstacle(stone);
        well.setUseThisToRemoveObstacle(rope);

        Monster m1 = new Monster("Giant Rat", "Just a big bad rat", 20, 5);
        Monster m2 = new Monster("Onikuma", "Demon-bear that steals horses", 40, 10);
        Monster m3 = new Monster("Phoenix", "A fire elemental in the shape of a large bird", 50, 15);
        Monster m4 = new Monster("Vampire", "Shapeshifting undead in the shape of either a human or a bat, which feed of the blood of it's victims", 60, 20);
        Monster m5 = new Monster("Giant Ooze", "An acid amorphous or mutable creature without a single solid form", 65, 15);
        Monster m6 = new Monster("Shapeshifter", "A cant of doppelganger, it usually takes the form of it's victim to confuse his friends", 70, 10);
        Monster m7 = new Monster("Ghost", "Wandering spirit, unable to get to heaven, because it is being held back because of some kind of regret from its past", 80, 25);
        Monster gatekeeper = new Monster("GateKeeper", "It's a giant with a huge brick used as a kind of mace looks like he is guarding something", 100, 20);
        Monster BigBoss = new Monster("Dragon-trump", "You stand across a huge dragon, with a weird haircut.", 150, 20);

        Room A2 = new Room("A2 - rope room", "You walk into a `seemingly´ empty room.");
        Room A3 = new Room("A3 - Stone room", "You enter a small room that is only lit up by a still burning torch that lies on the ground. Next to it is a small rock that is a throwable size.");
        Room A4 = new Room("A4 - Startroom", "There is a small hole at the top of the cave. It lightens up the room which shows you 3 paths.");
        Room A5 = new Room("A5 - The Ugly Room", "You’re looking around…. Hmmm it’s like you have been here before. Cold with ugly walls… Wait, ahhh I’m thinking about my apartment back home! ");

        Room B3 = new Room("B3", "There is a small hole at the top of the cave. It lightens up the room which shows you 3 paths.");
        Room B4 = new Room("B4", "A large pit of a weird liquid substance has filled the middle of this room. Passageways makes it possible to go around, You figure that it is better to steer around this substance.");
        Room B5 = new Room("B5 - ScrollRoom", "There is slightly light piping in from the holes in the walls. There is an item in the middle of the room.  I’ll better inspect it. What is that sound that I hear??");
        Room B6 = new Room("B6 - The Kitchen", "WTF… This room is full of dead rats… Is that human bite-marks? I guess this is the kitchen!!");

        Room C2 = new Room("C2 - GateKeeper", "You walk into a bigass room lit with fire.\n In the middle of the the room is a HUUUGE Dragon with hair like Donald Trump.\n It quickly feels your presence, and sends his minion politicians after you.");
        Room C3 = new Room("C3 - Pickaxe room", "A skeleton lies in the room. His demise must come from the pickaxe that has been firmly attached to his skull.");
        Room C4 = new Room("C4 - Crazy compas room", "Before you is a granite pedestal with a compass on it. The compass needle is spinning wildly. What does it mean?");
        Room C5 = new Room("C5 - The bug", "The sound is coming closer… I feel I’m on the right path. But they people at built these rooms really need a good designer!! It looks like shit. Ohhh a bug… ummmm foooood…");
        Room C6 = new Room("C6 - The Wall", "What the hell… There are strange lights coming from the south wall. I better check it out. I get the strange feeling that this could be the right way. The south wall also doesn’t look so solid.");

        Room D2 = new Room("D2 - WellRoom", "In the middle of this new room there is a well. It looks hundreds of years old.");
        Room D3 = new Room("D3", "This room is split by what seems like an endless ravine. There is crude rope bridge that you can use to cross.");
        Room D4 = new Room("D4", "A small campfire lights the room, which reveals large drawings of different animals.");
        D4.setAccess(false);
        D4.setUseThisToAccessRoom(scroll);

        Room D5 = new Room("D5 - The Dark Room", "What is that sound and why is this room so dark??!! Well fuck it… Let me feel around. I wish I had a flashlight… Actually I wish I had a million dollars. Oh tiny fairy… WHERE ARE YOU??!!  ");
        Room D6 = new Room("D6 - The WHY Room", "YEEESSSS finally I get a little success. I knew there was something fishy about that wall. Good thing I was listening to my instincts. But why am I still in this shit hole….");
        D6.setAccess(false);
        D6.setUseThisToAccessRoom(pickaxe);

        Room E1 = new Room("E1 - BigBoss Donald Trump", "You have finally reached the BigBoss Donald Trump Dragon! Good Job! The dragon breathes out flames, telling you to come at him.\nHope you are ready for this. FIGHT.");
        Room E2 = new Room("E2", "This room has an eerie feeling to it.");
        Room E3 = new Room("E3", "You only see a small passage which can narrowly pass through.");
        Room E4 = new Room("E4", "Lit candles are everywhere. It lights up a pathway to an huge altar. After further study you see a the altar is marked with paintings of a huge winged beast.");
        Room E6 = new Room("E6 - The exit", "You finally found the exit.");
        E6.setAccess(false);
        
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

        A2.setItem(rope);
        A3.setItem(stone);
        A5.setMonster(m5);
        B3.setMonster(m1);
        B4.setItem(pot1);

        B5.setObstacle(chest);
        B5.setItem(scroll);
        scroll.setAccess(false);
        B6.setMonster(m3);

        C2.setMonster(gatekeeper);
        C3.setItem(pickaxe);
        C3.setMonster(m6);
        C4.setItem(pot2);
        C5.setMonster(m2);

        D2.setObstacle(well);
        D2.setItem(sword);
        sword.setAccess(false);

        D3.setMonster(m7);
        D5.setObstacle(vase);
        D5.setItem(key);
        key.setAccess(false);
        E1.setMonster(BigBoss);
        E2.setItem(pot3);
        E3.setMonster(m4);

        A2.setEast(A3);

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
        player.setCurrentDmg(player.getBaseDmg());
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
        movements.add("Press 5 to explore the room");
        movements.add("press 6 to show inventory");
        return movements;
    }

    public void move(Player p, TUI t) {
        p.getCurrentRoom().getDescription();
        ArrayList<String> movements = getMoveOptions(p);
        int i = t.getPlayerMoveInput(movements);

        switch (i) {
            case 1:
                if (p.getCurrentRoom().getNorth().isAccess()) {
                    p.setCurrentRoom(p.getCurrentRoom().getNorth());
                } else {
                    t.getErrorMsg();
                }
                break;
            case 2:
                if (p.getCurrentRoom().getEast().isAccess()) {
                    p.setCurrentRoom(p.getCurrentRoom().getEast());
                } else {
                    t.getErrorMsg();
                }
                break;
            case 3:
                if (p.getCurrentRoom().getSouth().isAccess()) {
                    p.setCurrentRoom(p.getCurrentRoom().getSouth());
                } else {
                    t.getErrorMsg();
                }
                break;
            case 4:
                if (p.getCurrentRoom().getWest().isAccess()) {
                    p.setCurrentRoom(p.getCurrentRoom().getWest());
                } else {
                    t.getErrorMsg();
                }
                break;
            case 5:
                exploreLogic(p, t);
                break;
            case 6:
                useItem(p, t);

        }
        System.out.println(p.getCurrentRoom().getDescription());
    }

    private void exploreLogic(Player p, TUI t) {
        //tjekker om der er item i rummet
        if (p.getCurrentRoom().getItem() != null) {
            //this is the playerinput
            String input = t.getPlayerInput2();
            if ("yes".equals(input)) {
                Item currentRoomItem = p.getCurrentRoom().getItem();
                //Tjekker om du har access til item
                if (currentRoomItem.isAccess()) {
                    p.addItemToInventory(currentRoomItem);
                    t.printPickup(currentRoomItem.getName());
                } else {
                    t.getPickupErrorMsg();
                }
            } else if ("no".equals(input)) {
                t.printNoPickup();
            }
        } else {
            t.getErrorMsg2();
        }
    }

    private void useItem(Player p, TUI t) {
        //this if statement checks that the inventory is not empty, and if true it prints out all items in backpack.
        if (!p.getInventory().isEmpty()) {
            p.getInventory().forEach((inventory) -> {
                System.out.println(inventory.getName());
            });
            //printer info om hvordan man bruger et item.
            t.printUseCommand();
            //henter player input
            String input = t.getPlayerUseItemInput();
            //for hver item i player inventory
            for (int i = 0; i < p.getInventory().size(); i++) {
                Item item = p.getInventory().get(i);
                if ("cancel".equals(input)) {
                    break;
                } else if (item.getName().equalsIgnoreCase(input)) {

                    Room cur = p.getCurrentRoom();
                    Obstacles obs = cur.getObstacle();

                    //Hvis item typen er consumable udføre den logikken her
                    if ("consumable".equals(item.getItemType())) {
                        //hvis input er en potion kører den usePotion logik
                        if ("Small HealthPotion".equals(item.getName()) || "HealthPotion".equals(item.getName()) || "Big HealthPotion".equals(item.getName())) {
                            usePotion(item, p, t);
                        } else if (obs != null) {
                            if (obs.getUseThisToRemoveObstacle().equals(item)) {
                                cur.getItem().setAccess(true);
                                t.printUseItem(item);
                                p.removeItemFromInventory(item);
                                break;
                            }
                        } else if (cur.getSouth() != null) {
                            if (cur.getSouth().getUseThisToAccessRoom() != null) {
                                if (cur.getSouth().getUseThisToAccessRoom().equals(item)) {
                                    cur.getSouth().setAccess(true);
                                    t.printUseItem(item);
                                    p.removeItemFromInventory(item);
                                    break;
                                }
                            }
                        } else {
                            t.getError();
                        }
                    } //Hvis item typen er equipable udføre den logikken her
                    else if ("equipable".equals(item.getItemType())) {
                        if (!p.getEquip().equals(item)) {
                            p.setEquip(item);
                            p.setCurrentDmg(p.getBaseDmg() + item.getStatUp());
                            t.printStatUp();
                        }
                        else {
                            t.getEquipError();
                        }
                    }
                }
            }
        } else {
            t.getErrorMsg3();
        }
    }

    private void usePotion(Item item, Player p, TUI t) {
        if (p.getHealth() < 100) {
            if (p.getHealth() + item.getStatUp() > 100) {
                p.setHealth(100);
                t.printCurrentHealth(p);
                p.removeItemFromInventory(item);
            } else {
                p.setHealth(p.getHealth() + item.getStatUp());
                t.printCurrentHealth(p);
                p.removeItemFromInventory(item);
            }
        } else {
            t.potErrorMsg();
        }
    }

    public void checkCombat(Player p, TUI t) {
        Room cur = p.getCurrentRoom();

        if (cur.getMonster() != null) {
            if (!cur.getMonster().isIsDead()) {
                runCombat(p, t);
            }
        }
    }

    private void runCombat(Player p, TUI t) {
        Monster monster = p.getCurrentRoom().getMonster();
        int counter = 0;
        t.printMonsterDetails(monster);
        ArrayList<String> combat = getCombatCommands();
        while (!monster.isIsDead()) {
            if (counter % 2 != 0) {
                //this happens when its the monsters turn
                monsterAttack(p, t, monster);
                counter++;
            } else {
                //this happens when its the players turn
                int i = t.getPlayerCombatInput(combat);
                switch (i) {
                    case 1:
                        playerAttack(p, t, monster);

                        if (!monster.isIsDead()) {
                            counter++;
                            break;
                        }
                        break;
                    case 2:
                        useItem(p, t);
                        counter++;
                        break;
                }
            }
        }
    }

    private ArrayList<String> getCombatCommands() {
        ArrayList<String> combat = new ArrayList();
        combat.add("Press 1 for attack");
        combat.add("Press 2 to use item");
        return combat;
    }

    private void playerAttack(Player p, TUI t, Monster m) {
        Random r = new Random();

        switch (r.nextInt(3)) {
            case 0:
                System.out.println("You hit the target.\n");
                m.setHealth(m.getHealth() - p.getCurrentDmg());
                if (!checkDead(p, m)) {
                    t.printMonsterHealth(m);
                }
                break;
            case 1:
                System.out.println("You missed.\n");
                break;
            case 2:
                System.out.println("You critical hit for twice your damageoutput.\n");
                m.setHealth(m.getHealth() - (p.getCurrentDmg() * 2));
                if (!checkDead(p, m)) {
                    t.printMonsterHealth(m);
                }
                break;
        }
    }

    private void monsterAttack(Player p, TUI t, Monster monster) {
        Random r = new Random();
        switch (r.nextInt(3)) {
            case 0:
                System.out.println("The " + monster.getName() + " hits.");
                p.setHealth(p.getHealth() - monster.getDmg());
                if (!checkDead(p, monster)) {
                    t.printPlayerHealth(p);
                }
                break;
            case 1:
                System.out.println("The " + monster.getName() + " missed.");
                break;
            case 2:
                System.out.println("The " + monster.getName() + " critical hits you for twice its damageoutput.");
                p.setHealth(p.getHealth() - (monster.getDmg() * 2));
                if (!checkDead(p, monster)) {
                    t.printPlayerHealth(p);
                }
                break;
        }
    }

    private boolean checkDead(Player p, Monster m) {
        if (p.getHealth() <= 0) {
            System.out.println("You are dead");
            p.setIsDead(true);
            return true;
        }
        if (m.getHealth() <= 0) {
            System.out.println("You defeat the monster!\n");
            m.setIsDead(true);
            if (m.getName().equals("GateKeeper")) {
                rooms.get(18).setAccess(true);
            }
            else if (m.getName().equals("Dragon-trump")) {
                rooms.get(22).setAccess(true);
            }
            return true;
        }
        return false;
    }

    public boolean getWinConditon(Player p) {
        if (p.getCurrentRoom().equals(rooms.get(22))) {
            System.out.println("you've found the exit, gongratulations you win the game!");
            return true;
        }
        return false;
    }
}

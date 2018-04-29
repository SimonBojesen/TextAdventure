package gamelogic;

import superclasses.Player;
import superclasses.Item;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import superclasses.Monster;

/**
 *
 * @author Simon
 */
public class TUI {

    Scanner sc = new Scanner(System.in);

    public void gameStart(Player p) {
        System.out.println("Velkommen " + p.getName());
    }

    public void getRoomDescription(Player p) {
        String name = p.getCurrentRoom().getRoomName();
        String desc = p.getCurrentRoom().getDescription();
        System.out.println("Roomname: " + name + "\n" + desc);

    }

    public int getPlayerMoveInput(ArrayList<String> a) {

        while (true) {
            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }
            System.out.println("Where do you want to go?\n");

            String x = sc.next();

            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).substring("Press ".length(), "Press ".length() + 1).equals(x)) {
                    int c = Integer.parseInt(x);
                    return c;

                }

            }
            System.out.println("Please choose a valid option.\n");
        }
    }

    public void getErrorMsg() {
        System.out.println("You cant access this path yet.\n");
    }

    public String getPlayerInput2() {
        while (true) {
            System.out.println("You have found an item in the room, do you want to pick it up? Type yes or no.\n");
            String y = sc.next();

            if ("yes".equals(y) || "no".equals(y)) {
                return y;
            }
            System.out.println("Please type yes or no.\n");
        }
    }

    public void printPickup(String itemname) {
        System.out.println("You picked up a " + itemname + " and continued onward.\n");
    }

    public void getErrorMsg2() {
        System.out.println("Theres nothing to explore here.\n");
    }

    public void printNoPickup() {
        System.out.println("You continued on without picking up the item.\n");
    }

    public void getErrorMsg3() {
        System.out.println("Your inventory is empty.\n");
    }

    public void printUseCommand() {
        System.out.println("Type the name of an item if you want to use it, or you can type cancel to get back on the road.\n");
    }

    public String getPlayerUseItemInput() {
        String input = sc.next();
        return input;
    }

    public void getErrorMsg4() {
        System.out.println("Please input correct use command.\n");
    }

    public void getPickupErrorMsg() {
        System.out.println("You still need to do something in this room to access the item.\n");
    }

    public void printUseItem(Item item) {
        if (null != item.getName()) switch (item.getName()) {
            case "Key":
                System.out.println("You use the key to unlock the chest.\n");
                break;
            case "Stone":
                System.out.println("You use the stone to break the vase.\n");
                break;
            case "Rope":
                System.out.println("You use the rope to climb to the bottom of the well.\n");
                break;
            case "Scroll":
                System.out.println("You read the scrolls content. It seems to be a spell. You try saying the magic word, and a new path appears.\n");
                break;
            case "Pickaxe":
                System.out.println("You use the pickaxe to clear a path.\n");
            default:
                break;
        }
    }

    public void getError() {
        System.out.println("this item has no use effect in the current room.\n");
    }

    public void printMonsterDetails(Monster monster) {
        System.out.println("You get attacked by " + monster.getName());
        System.out.println(monster.getDescription() + "\n");
    }

    public void potErrorMsg() {
        System.out.println("You are already at max health.\n");
    }

    public void printCurrentHealth(Player p) {
        System.out.println("Your health is now: " + p.getHealth() + "\n");
    }

    public int getPlayerCombatInput(ArrayList<String> combat) {
        while (true) {
            for (int i = 0; i < combat.size(); i++) {
                System.out.println(combat.get(i));
            }
            System.out.println("What will you do?\n");

            String x = sc.next();

            for (int i = 0; i < combat.size(); i++) {
                if (combat.get(i).substring("Press ".length(), "Press ".length() + 1).equals(x)) {
                    int c = Integer.parseInt(x);
                    return c;

                }

            }
            System.out.println("Please choose a valid option.\n");
        }
    }

    public void printMonsterHealth(Monster m) {
        System.out.println("Monster health: " + m.getHealth() + "\n");
    }


    public void printPlayerHealth(Player p) {
        System.out.println("Player health: " + p.getHealth() + "\n");
    }

    public void getEquipError() {
        System.out.println("This item is already equipped.\n");
    }

    void printStatUp() {
        
    }

    
}

package textadventure;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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

//    public int getPlayerInput(ArrayList<String> a){
//        
//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i)); 
//        }
//        System.out.println("Where do you want to go?");
//        try {
//            int i = sc.nextInt();
//            return i;
//        }
//        catch(InputMismatchException exception){
//            System.out.println("This is not an Integer");
//            break;
//        }
//        
////        if (i < 1 || i > 4) {
////            System.out.println("Please press a right option.");
////        }
////        else if ()
//        return 0;
//    }
    public int getPlayerInput(ArrayList<String> a) {

        while (true) {
            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }
            System.out.println("Where do you want to go?");

            String x = sc.next();
            
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).substring("Press ".length(), "Press ".length()+1).equals(x)) {
                    int c = Integer.parseInt(x);
                    return c;
                    
                } 
                
            }
            System.out.println("Please choose the right option");
        }
    }

}

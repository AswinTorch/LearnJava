import java.util.Scanner;

public class AdventureChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Vars
        String r2and3, r4and5, r6and7, e1and2, e3and4, e5and6, e7and8;

        //The Story
        System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or " +
                "into the \"kitchen\"?");
        r2and3 = input.next();
        System.out.println();
        if (r2and3.equals("upstairs")){
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            r4and5 = input.next();
            if (r4and5.equals("bedroom")){
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");
                e1and2 = input.next();
                if (e1and2.equals("yes")){
                    System.out.println("You fall down a void and die.");
                }
                if (e1and2.equals("no")){
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
            }
            if (r4and5.equals("bathroom")){
                System.out.println("You are in a fancy bathroom, with expensive-looking mirrors.  The\n" +
                        "bathtub is still running. Would you like to close the tap? (\"yes\" or \"no\")");
                e1and2 = input.next();
                if (e1and2.equals("yes")){
                    System.out.println("You drown and die.");
                }
                if (e1and2.equals("no")){
                    System.out.println("Well, then I guess you'll never know what was brewing.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
            }


        }
        if (r2and3.equals("kitchen")) {
            System.out.println("There is a long counter top with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            r4and5 = input.next();
            if (r4and5.equals("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");
                e1and2 = input.next();
                if (e1and2.equals("yes")) {
                    System.out.println("You eat and eat till you can eat no more. You live.");
                }
                if (e1and2.equals("no")) {
                    System.out.println("You die of starvation. Eventually.");
                }
            }
            if (r4and5.equals("cabinet")) {
                System.out.println("Inside the cabinet you see a hole.  It looks pretty deep.\n" +
                        "Would you like to reach in? (\"yes\" or \"no\")");
                e1and2 = input.next();
                if (e1and2.equals("yes")) {
                    System.out.println("Your hand gets chopped off and you die.");
                }
                if (e1and2.equals("no")) {
                    System.out.println("You live a good life. You find all the riches.");
                }
            }

        }

    }
}

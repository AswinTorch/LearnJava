import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Vars
        int weight, planetno;
        double planetweight;
        //Method
        System.out.print("Please enter your current Earth weight: ");
        weight = keyboard.nextInt();

        System.out.println();
        System.out.println("I have information for the following planets: ");
        System.out.println("  1. Venus   2. Mars   3. Jupiter");
        System.out.println("  4. Saturn  5. Uranus 6. Neptune");
        System.out.println();
        System.out.print("Which planet are you visiting? ");
        planetno = keyboard.nextInt();
        System.out.println();
        //Conditions
        if (planetno == 1) {
            planetweight = weight * 0.78;
            System.out.print("Your weight would be " + planetweight + " pounds on that planet.");
        }
        else if (planetno == 2) {
            planetweight = weight * 0.39;
            System.out.print("Your weight would be " + planetweight + " pounds on that planet.");
        }
        else if (planetno == 3) {
            planetweight = weight * 2.65;
            System.out.print("Your weight would be " + planetweight + " pounds on that planet.");
        }
        else if (planetno == 4) {
            planetweight = weight * 1.17;
            System.out.print("Your weight would be " + planetweight + " pounds on that planet.");
        }
        else if (planetno == 5) {
            planetweight = weight * 1.05;
            System.out.print("Your weight would be " + planetweight + " pounds on that planet.");
        }
        else if (planetno == 6) {
            planetweight = weight * 1.23;
            System.out.print("Your weight would be " + planetweight + " pounds on that planet.");
        }
        else{
            System.out.print("What planet are you trying to go to?");
        }
    }
}

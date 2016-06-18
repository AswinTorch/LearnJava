import java.util.Scanner;

public class DrivingAgeAgain {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Vars
        String name; int age;
        //Methods
        System.out.print("Hey, what's your name? I keep forgetting. ");
        name = keyboard.next();
        System.out.print("Okay, " + name + ", how old are you? ");
        age = keyboard.nextInt();

        //Conditions
        if (age < 16){
            System.out.print("You can't drive.");
        }
        else if (age >= 16 && age <= 17){
            System.out.print("You can drive, but not vote.");
        }
        else if (age >= 18 && age <= 24){
            System.out.print("You can vote, but not rent a car.");
        }
        else if (age >= 25){
            System.out.print("You can do ANYTHING.");
        }


    }
}

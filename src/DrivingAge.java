import java.util.Scanner;

public class DrivingAge {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Vars
        String name; int age;
        //Methods
        System.out.print("Hey, what's your name? ");
        name = keyboard.next();
        System.out.print("Okay, " + name + ", how old are you? ");
        age = keyboard.nextInt();

        if (age < 16){
            System.out.print(name + ", You can't drive!");
        }
        if (age < 18){
            System.out.print(name + ", You can't vote!");
        }
        if (age < 25){
            System.out.print(name + ", You can't rent a car!");
        }
        if (age >= 25){
            System.out.print(name + ", You can do anything that's legal. :)");
        }

    }
}

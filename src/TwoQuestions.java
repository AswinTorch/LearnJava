import java.util.Scanner;

public class TwoQuestions {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Vars
        String a1, a2;
        //Start Up Statements
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println();
        //Question 1
        System.out.println("Q1. Is it an animal, vegetable, or mineral?");
        a1 = keyboard.next();
        System.out.println();
        //Question 2
        System.out.println("Q2. Is it bigger than a breadbox?");
        a2 = keyboard.next();
        System.out.println();

        if (a1.equals("animal")){
            if (a2.equals("yes")){
                System.out.println("My guess is that you are thinking of a Moose.");
            }
            if (a2.equals("no")){
                System.out.println("My guess is that you are thinking of a Squirrel");
            }
        }
        if (a1.equals("vegetable")){
            if (a2.equals("yes")){
                System.out.println("My guess is that you are thinking of a Watermelon.");
            }
            if (a2.equals("no")){
                System.out.println("My guess is that you are thinking of a Carrot.");
            }
        }
        if (a1.equals("mineral")){
            if (a2.equals("yes")){
                System.out.println("My guess is that you are thinking of a Paper Clip.");
            }
            if (a2.equals("no")){
                System.out.println("My guess is that you are thinking of Kryptonite.");
            }
        }
    }
}

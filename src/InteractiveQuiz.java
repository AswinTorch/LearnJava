import java.util.Scanner;

public class InteractiveQuiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Vars
        int a1, a2, a3, correct = 0;

        //Question One Method
        System.out.println("Q1. What is the capital of Alaska?");
        System.out.println("        1. Melbourne");
        System.out.println("        2. Anchorage");
        System.out.println("        3. Juneau");
        a1 = keyboard.nextInt();
        if (a1 == 1){
            System.out.println("That's incorrect!");
        }
        else if (a1 == 2){
            System.out.println("That's incorrect!");
        }
        else if (a1 == 3){
            System.out.println("That's correct!");
            correct = correct + 1;
        }
        else{
            System.out.println("Error");
        }
        //Question Two Method
        System.out.println("Q2. Can you store the value \"cat\" in a variable of type int?");
        System.out.println("        1. Yes");
        System.out.println("        2. No");
        a2 = keyboard.nextInt();
        if (a2 == 1){
            System.out.println("That's incorrect!");
        }
        else if (a2 == 2){
            System.out.println("That's correct!");
            correct = correct + 1;
        }
        else{
            System.out.println("Error");
        }
        //Question Three Method
        System.out.println("Q1. What is the result of 9+6/3?");
        System.out.println("        1. 5");
        System.out.println("        2. 11");
        System.out.println("        3. 15/3");
        a3 = keyboard.nextInt();
        if (a3 == 1){
            System.out.println("That's incorrect!");
        }
        else if (a3 == 2){
            System.out.println("That's correct!");
            correct = correct + 1;
        }
        else if (a3 == 3){
            System.out.println("That's incorrect!");
        }
        else{
            System.out.println("Error");
        }
        //Final
        System.out.println();
        System.out.println("Overall, you got " + correct + " out of 3 correct.");
        System.out.println("Thanks for playing!");


    }
}

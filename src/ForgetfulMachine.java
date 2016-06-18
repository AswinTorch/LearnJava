import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String word1;
        String word2;
        int num1;
        int num2;

        System.out.println("Give me a word!");
        word1 = keyboard.next();

        System.out.println("Give me a second word!");
        word2 = keyboard.next();

        System.out.println("Amazing, now your favorite number?");
        num1 = keyboard.nextInt();

        System.out.println("And your second-favorite number?");
        num2 = keyboard.nextInt();

        System.out.print("Now, wasn't that fun? BUT WHO CARES?");
    }
}

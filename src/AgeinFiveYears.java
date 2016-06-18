import java.util.Scanner;

public class AgeinFiveYears {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Vars
        String name; int age;
        System.out.print("Hello. What is your name? ");
        name = keyboard.next();
        System.out.print("Hi, " + name + "! How old are you? ");
        age = keyboard.nextInt();
        System.out.println("Did you know that in five years you will be " + (age + 5)
                + " years old? \nAnd five years ago, you were " + age + "! Imagine that!");

    }
}

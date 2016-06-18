import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Vars
        String name;
        int age;
        double salary;
        //Method
        System.out.println("Hello there! What is your name?");
        name = keyboard.next();
        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();
        System.out.println("So you're " + age + ", eh? That's so young!" +
                " \nHow much do you make, " + name + "?");
        salary = keyboard.nextDouble();
        System.out.print(salary + "! I hope that's per hour and not per year! LOL!");


    }
}

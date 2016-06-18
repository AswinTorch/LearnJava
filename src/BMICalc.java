import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Vars
        int heightin; int weightlb;
        //Method
        System.out.print("Your height in inches: ");
        heightin = keyboard.nextInt();
        System.out.print("Your weight in pounds: ");
        weightlb = keyboard.nextInt();
        //Updated Vars
        double heightm = heightin * 0.025;
        double weightkg = weightlb * 0.45;

        System.out.print("Your BMI is " + weightkg / (heightm * heightm));
    }
}

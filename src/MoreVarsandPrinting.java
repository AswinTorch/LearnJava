public class MoreVarsandPrinting {
    public static void main(String[] args){
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;

        myName = "Aswin Nair";
        myAge = 18;
        myHeight = 72;
        myWeight = 210;
        myEyes = "Black";
        myTeeth = "White";
        myHair = "Black";

        System.out.println("Let's talk about " + myName + ".");
        System.out.println("He's " + myHeight + " inches tall.");
        System.out.println("He's " + myWeight + " pounds heavy.");
        System.out.println("Actually, that's pretty heavy but he's losing it.");
        System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
        System.out.println("His teeth are usually " + myTeeth + ".");

        System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight
                + " I get " + (myAge + myHeight + myWeight) + ".");

    }
}

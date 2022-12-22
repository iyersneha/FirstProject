package Day1;

import java.util.Scanner;
public class Eggs {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of eggs");
        int noOfEggs = sc.nextInt();

        Eggs eg =  new Eggs();
        eg.DisplayEggs(noOfEggs);

    }

    public void DisplayEggs(int noOfEggs){
        int grossEggs, grossRemainder, dozenEggs, eggsRemaining = 0;
        if(noOfEggs == 0)
            System.out.println("There are zero eggs");

        // Calculating gross
        grossEggs = noOfEggs/144;
        //System.out.println(grossEggs);
        grossRemainder = noOfEggs%144;
        //System.out.println(grossRemainder);

        // Calculating dozens
        dozenEggs = grossRemainder/12;
        //System.out.println(dozenEggs);
        eggsRemaining = grossRemainder%12;
        //System.out.println(eggsRemaining);

        System.out.println("Your number of eggs is " +grossEggs +" gross, " + dozenEggs+ " dozen, and " + eggsRemaining);
    }
}
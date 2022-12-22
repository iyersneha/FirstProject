package Day1;

import java.util.Scanner;
public class PalindromePrime {

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        PalindromePrime pp = new PalindromePrime();
        //pp.Palindrome(number);
        pp.Prime(number);
    }

    public void Palindrome(int number){
        int temp = number;
        int num = 0, add = 0;
        while(number > 0){    //121
            num = number%10;  //1     2   1
            number = number/10; //12  1   0
            add = add*10 + num; //1    12  121
        }
        if (temp == add)
            System.out.println("Is palindrome");
        else
            System.out.println("Is not palindrome");
        }

    public void Prime(int number){
        int check = 0;
        for (int i = 2; i < number/2; i++){
            if (number % i == 0){
                System.out.println("Not a prime number");
                check = 1;
                break;
            }
        if (check == 0){
            System.out.println("Prime number");
            System.out.println(number + "p");
        }
        }
    }
    }


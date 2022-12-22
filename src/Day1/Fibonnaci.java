package Day1;

import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        Fibonnaci fb = new Fibonnaci();
        fb.Fib(number);
    }

    public void Fib(int number){
        int a = 0,b= 1,c =0;
        if (number == 0) {
            System.out.println(0);
        }
        for (int i = 2; i <= number; i++){
            c = a+b;  //1  2 3
            a =b;     // 1 1 2
            b = c;    // 1 2 3
            System.out.println(a);
        }

        //System.out.println(b);

    }
}

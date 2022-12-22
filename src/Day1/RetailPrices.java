package Day1;

import java.util.Scanner;
public class RetailPrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Number and Quantity Sold");
        int prodNum = sc.nextInt();
        //String prodCode= sc.next();
        int quantitySold = sc.nextInt();
        //System.out.println(prodNum);
        //System.out.println(prodCode);

        RetailPrices rp = new RetailPrices();
        rp.Prices(prodNum, quantitySold);
    }

    public void Prices(int prodNum, int quantitySold){
        double totalCost = 0.0;

        switch(prodNum){
            case 1: totalCost = quantitySold * 22.50;
            break;
            case 2: totalCost = quantitySold * 44.50;
            break;
            case 3: totalCost = quantitySold * 9.98;
            break;
            default: System.out.println("Wrong product number");
        }
        System.out.println(totalCost);

    }

}

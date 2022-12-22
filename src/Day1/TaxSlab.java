package Day1;

import java.util.Scanner;
public class TaxSlab {
    GenderDef[] genderDef = GenderDef.values();
    private String male;
    private String female;


    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender and salary");
        String gender = sc.next();
        int salary = sc.nextInt();
       //System.out.println(gender);
        //System.out.println(salary);

        TaxSlab ts = new TaxSlab();
        ts.taxCalculation(gender, salary);
}
// method to calculate tax slab
    public void taxCalculation(String gender, int salary)
    {
        for (GenderDef genderVal : genderDef){
              male= GenderDef.Male.getGenderValue();
              female=GenderDef.Female.getGenderValue();
        }
        double tax = 0.0;
        if (salary > 800000) {
            tax = salary * 0.3;
        }
        else if ((salary > 500001) & (salary <= 800000)) {
            tax = salary * 0.2;
        }
        else if ((salary > 190001) & (salary <= 500000)) {

            tax = salary * 0.1;
            System.out.println(tax);

        }
        else if ((salary > 180001) & (salary < 190000)){
            if (gender.equals("F")){
                tax = salary * 0.0;
                }
            else{
                    tax = salary*0.1;
                }}
        System.out.println("Tax to be paid is " + tax);
        }
    }
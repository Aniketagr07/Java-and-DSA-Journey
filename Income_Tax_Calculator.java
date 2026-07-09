import java.util.*;
public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float income=sc.nextFloat();
        if (income<500000) {
            System.out.print("Your tax is 0%");
            System.out.println("Therefore your salary is "+income);
        }
        else if (income>=500000 && income<1000000) {
            float tax=income*0.20f;
            float salary=income-tax;
            System.err.println("your tax is 20%");
            System.out.println("Your tax ammount is "+tax);
            System.out.println("Therefore your salsry is "+salary);
        }
        else {
            float tax=income*0.30f;
            float salary=income-tax;
            System.err.println("your tax is 30%");
            System.out.println("Your tax ammount is "+tax);
            System.out.println("Therefore your salsry is "+salary);
        }
    }
}

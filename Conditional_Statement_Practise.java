import java.util.*;
public class Conditional_Statement_Practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.print("Enter a no");
        int a=sc.nextInt();
        if (a<0) {
            System.out.println("The enterend no is negative");
        }
        else {
            System.out.println("The Enterend no is Positive");
        }*/
        /*System.out.print("Enter Your Temperature in Farenhiet:-");
        double a=sc.nextDouble();
        if (a>=100) {
            System.out.println("You have fever. Kindly conscern to a doctor");
        }
        else {
            System.out.println("You don't have fever. Just take a chill pill");
        }*/
        /*System.out.print("Enter the week no:-");
        int a=sc.nextInt();
        switch (a) {
            case 1:System.out.println("Hey It's Sunday");
                break;
            case 2:System.out.println("Hey It's Monday");
                break;
            case 3:System.out.println("Hey It's Tuesday");
                break;
            case 4:System.out.println("Hey It's Wednusday");
                break;
            case 5:System.out.println("Hey It's Thrusday");
                break;
            case 6:System.out.println("Hey It's Friday");
                break;
            case 7:System.out.println("Hey It's Saturday");
                break;
            default:System.out.println("Your are not of this world because we have only 7 days in a week");
        }*/
        System.out.print("Enter a year:-");
        int a=sc.nextInt();
        if (a%4==0) {
            System.out.println("It's a Leap Year");
        }
      
    }    
}

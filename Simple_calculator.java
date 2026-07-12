import java.util.*;
public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First no:-");
        int a=sc.nextInt();
        System.out.print("Enter the second no:-");
        int b=sc.nextInt();
        System.out.println("Choose the no of your choice for the opperation to be performed\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Divide\n5. Remainder");
        int number=sc.nextInt();
        switch (number) {
            case 1:System.out.println(a+b);
                break;
            case 2:System.out.println(a-b);
                break;
            case 3:System.out.println(a*b);
                break;
            case 4:System.out.println(a/b);
                break;
            case 5:System.out.println(a%b);
                break;
            default:System.out.println("Wrong Input");
        }
        
    }
}

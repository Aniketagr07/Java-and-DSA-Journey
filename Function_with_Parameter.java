import java.util.*;
public class Function_with_Parameter {
    public static int sum(int a,int b){
        int s=a+b;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First No.:- ");
        int a=sc.nextInt();
        System.out.print("Enter Second No.:- ");
        int b=sc.nextInt();
        System.out.println("Sum is :- "+sum(a,b));
    }
}
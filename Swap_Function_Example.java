import java.util.*;
public class Swap_Function_Example {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is:-"+a);
        System.out.println("b is:-"+b);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No.:- ");
        int a=sc.nextInt();
        System.out.print("Enter a No.:- ");
        int b=sc.nextInt();
        swap(a,b);   
    }
}

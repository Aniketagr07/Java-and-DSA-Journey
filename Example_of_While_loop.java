import java.util.*;
public class Example_of_While_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1;
        System.out.print("Enter a no.:-");
        int n=sc.nextInt();
        while (a<=n) {
            System.out.println(a);
            a++;
        }
    }
}

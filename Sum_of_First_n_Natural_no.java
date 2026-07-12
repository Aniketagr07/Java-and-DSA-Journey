import java.util.*;
public class Sum_of_First_n_Natural_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:-");
        int n=sc.nextInt();
        int sum=0;
        while (n>=0) {
            sum+=n;
            n--;
        }
        System.out.println("The Total is:-"+sum);
    }  
}

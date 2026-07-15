import java.util.*;
public class Continue_Statement_Example {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter a No.:- ");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
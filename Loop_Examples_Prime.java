import java.util.*;
public class Loop_Examples_Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter a No:- ");
            int n=sc.nextInt();
            // int c=0;
            // for(int i=2;i<n;i++){
            //     if(n%i==0){
            //         c++;
            //     }
            // }
            // if(c>0){
            //     System.out.println(n+" is not a prime no");
            // }
            // else{
            //     System.out.println(n+" is a Prime no");
            // }
            boolean isPrime=true;
            // for(int i=2;i<n;i++){
            //     if(n%i==0){
            //         isPrime=false;
            //     }
            // }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println(n+" is a Prime No.");
            }
            else{
                System.out.println(n+" is not a Prime No");
            }
        }while(true);
    }
}

import java.util.*;
public class Function_Examples {

// Multiplication
/*
    public static int multiply(int a,int b){
        int p=a*b;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First no. :-");
        int a=sc.nextInt();
        System.out.print("Enter Second no. :-");
        int b=sc.nextInt();
        int res=multiply(a,b);
        System.out.println("The Product of the two no is:- "+res);
    }
}
*/

//Factorial
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    /*
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. :-");
        int n=sc.nextInt();
        int res=factorial(n);
        System.out.println(res);
    }
*/

//Binomial Coefficient

    public static int binomial_coefficient(int n,int r){
        int f1=factorial(n);
        int f2=factorial(r);
        int f3=factorial(n-r);
        int res=f1/(f2*f3);
        return res;
    }
/*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:-");
        int n=sc.nextInt();
        System.out.print("Enter r:-");
        int r=sc.nextInt();
        System.out.println(binomial_coefficient(n,r));
    }
*/

//No. is Prime or Not

    public static boolean isPrime(int n){
        if(n==1 || n==2){
            return true;
        }
        /*for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }*/
       for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
       }
        return true;
    }
    /*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No.:- ");
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }
*/

//All Prime in Range

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No.:- ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            boolean res=isPrime(i);
            if (res) {
                System.out.print(i+" ");
            }
        }
    }
}
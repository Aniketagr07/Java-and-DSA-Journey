import java.util.*;
public class Pattern_printing_examples {
    public static void main(String[] args) {
// Star Pattern
/*

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No:- ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

// Inverted Star

 /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No.:- ");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

//Half Pyramid
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a NO.:- ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
*/

//Half Pyramid 
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No.:- ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
*/


//Character Pattern

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No.:- ");
        int n=sc.nextInt();
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

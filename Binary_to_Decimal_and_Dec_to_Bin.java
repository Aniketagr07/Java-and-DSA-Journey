import java.util.*;
public class Binary_to_Decimal_and_Dec_to_Bin {
    public static void bintoDec(int n){
        int dec=0;
        for(int i=0;n>0;i++){
            int d=n%10;
            dec=dec+d*(int)Math.pow(2, i);
            n=n/10;
        }
        System.out.println("Decimal Equivalent: "+dec);
    }
    public static void DectoBin(int n){
        int bin=0;
        int p=0;
        while(n>0){
            bin+=n%2*Math.pow(10,p);
            n=n/2;
            p++;
        }
        System.out.println("Binary Equivalent: "+bin);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Binary No.:- ");
        int n=sc.nextInt();
        bintoDec(n);
        DectoBin(6 );
    }
}

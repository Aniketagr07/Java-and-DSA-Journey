import java.util.*;
public class Pattern_printing_Advance_examples {
    //Hollow Rectangle
    public static void hollow_rectangle(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1||i==r||j==1||j==c){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            /*
            for(int j=0;j<=n-1;j++){
                if(j==n-i||j>n-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            */
           //Alternate Method
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
           }
           for(int j=1;j<=i;j++){
            System.out.print("* ");
           }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_with_no(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int n){
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void triangle_0_1(int n){
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a=(a==1)?0:1;
                /*
                if(a==1){
                    a=0;
                }
                else{
                    a=1;
                }
                    */
            }
            System.out.println();
        }
    }
    public static void butterfly_pattern(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(j<=i||j>c-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=1;j<=c;j++){
                if(j<=(c/2)-i||j>(c/2)+i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void rhombus(int n){
        /*
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        for(int i=0;i<n;i++){
            for(int j=1;j<=(n*2)-1;j++){
                if(j<n-i||j>=(n*2)-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        /*
        for(int i=0;i<n;i++){
            for(int j=1;j<=(n*2)-1;j++){
                if(j<n-i){
                    System.out.print("  ");
                }
                else if(j==n-i||j==(n*2)-i-1||(j>n-i&&j<n*2-i-1&&(i==0||i==n-1))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
       }
    }
    public static void diamond(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<(i*2)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<n-i+1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<(i*2)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void number_pyramid(int n){
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(a+"   ");
            }
            a++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // System.out.print("Enter the no of rows:- ");
        // int r=sc.nextInt();
        // System.out.print("Enter the no. of columns:- ");
        // int c=sc.nextInt();
        //hollow_rectangle(r, c);
        
       System.out.print("Enter the no.:- ");
       int n=sc.nextInt();
       //inverted_rotated_half_pyramid(n);
       //inverted_half_pyramid_with_no(n);
       //floyds_triangle(n);
       //triangle_0_1(n);
       //butterfly_pattern(n, 2 * n);
       //hollow_rhombus(n);
       //diamond(n);
        number_pyramid(n);
    }
}

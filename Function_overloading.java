import java.util.*;
public class Function_overloading {
    public static int multiply(int a,int b){
        return a*b;
    }
    public static float multiply(float a,float b){
        return a*b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static int multiply(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println(multiply(2,3));
        System.out.println(multiply(4.2f,3.5f));
        System.out.println(multiply(4.256852,3.241555));
        System.out.println(multiply(4,6,9));

    }
}

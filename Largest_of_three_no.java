public class Largest_of_three_no {
    public static void main(String[] args) {
        int a=1;
        int b=3;
        int c=6;
        if (a>b && a>c) {
            System.out.println("The Largest of the three is "+a);
        }
        else if (b>a && b>c) {
            System.out.println("The Largest of three is "+b);
        }
        else {
            System.out.println("The Largest of the three is "+c);
        }
    }
}

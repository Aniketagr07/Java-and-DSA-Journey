public class For_loop_Example {
    public static void main(String[] args) {
        //for(int i=1;i<=4;i++){
        //    System.out.print("* * * *");
        //    System.out.println();
        //}
        //int n=30107;
        //while (n>0){
        //    int last_digi=n%10;
        //    System.out.print(last_digi+" ");
        //    n/=10;
        //}
        /*for(int i=030107;i>0;i/=10){ //i ka limit exceed ho raha hai
            int last_digi=i%10;
            System.out.print(last_digi+" ");
        } */
       int rev=0;
       for (int i=10899;i>0;i/=10){
        int last_digi=i%10;
        rev=rev*10+last_digi;
       }
       System.out.print(rev);
    }
}

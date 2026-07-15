import java.util.*;
public class Continue_Statement{
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        int n=2514795;
        int sum=0;
        while(n>0){
            int last=n%10;
            if(last%2!=0){
                sum+=last;
            }
            n=n/10;
        }
        System.out.println(sum);
    }
    
    
}

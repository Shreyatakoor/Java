import java.util.*;
public class Repeated {
    public static void main(String[] args){
        int n=2514795,repeated=5;
        int count=0;
        while(n>0){
            int last=n%10;
            if(last==repeated){
                count++;
            }
            n=n/10;
            
        }
        System.out.println(count);
    }
    
}

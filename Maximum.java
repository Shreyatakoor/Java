import java.util.*;
public class ItemID {
    public static void main(String[] args){
        int n=32387634;//n=2514795 o/p:-9
        int max=0;
        while(n>0){
            int last=n%10;
            if(last>max){
                max=last;
                
            }
            n=n/10;
            
        }
        System.out.println(max);
    }
    
}

import java.util.*;
public class HashMap {
    public static void main(String[] args){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("English",90);
        map.put("Maths",95);
        map.put("Science",80);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>=90){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    
}

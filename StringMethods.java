public class SimpleStringMethods {
    public static void main(String args[]){
        String text="Hello Java";
        System.out.println("original:"+text);     
         System.out.println("Length:"+text.length());
         System.out.println("Uppercase:"+text.toUpperCase()); 
         System.out.println("Lowercase:"+text.toLowerCase()); 
        System.out.println("Character at index 1: "+text.charAt(1)); 
         System.out.println("contains 'Java':"+text.contains("Java")); 
          System.out.println("Replace 'java' with 'world' :"+text.replace("Java","World")); 
           System.out.println("Substring from index 6: :"+text.substring(6)); 
    }
    
}

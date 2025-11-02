import java.util.Scanner;
public class Demo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.println("enter your name:");
        String name=sc.nextLine();
        System.out.println("enter your marks:");
        Double marks=sc.nextDouble();
        System.out.println("/nHello"+name+",you entered number:"+num+",and marks:"+marks);
        sc.close();
        
    }
    
}

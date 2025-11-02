import java.util.Scanner;
class AddNumbers{
    public int add(int a,int b){
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("enter second number:");
        int num2=sc.nextInt();
        AddNumbers a=new AddNumbers();
        
        int sum=a.add(10,50);
        System.out.println("sum is:"+sum);
        sc.close();
    
        
    }
    }

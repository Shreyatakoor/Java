public class Calculator {
    public int multiply(int x,int y){
        int result=x*y;
        return result;    
    }
    public static void main(String args[]){
        Calculator calc=new Calculator();
        System.out.println(calc.multiply(4,5));
    }
}

class Parent1{
    String name;
    int b;
    Parent1(String name,int b){
        this.name=name;
        this.b=b;
        
    }
    Parent1(){
 }
}
class Child1 extends Parent1{
    Child1(){
     
    }
}
public class NewClass11 {
    public static void main(String[] args){
        Parent1 ob=new Parent1("shreya",25);
System.out.println(ob.name+" "+ob.b);
    }
}
    

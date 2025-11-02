class Parent{
    int a;
    int b;
    Parent(int a,int b){
        this.a=a;
        this.b=b;
        
    }
    Parent(){
        
    }
}
class Child extends Parent{
    Child(){
        super(10,20);
        
    }
}
public class NewClass10 {
    public static void main(String[] args){
        Child ob=new Child();
        System.out.println(ob.a+" "+ob.b);
    }
}

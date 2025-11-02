class Parent2{
    String name;
    int b;
    Parent2(String name,int b){
        this.name=name;
        this.b=b;
        
    }
    Parent2(){
        this("default",0);
        
    }
}
public class NewClass12 {
    public static void main(String[] args){
        Parent2 ob=new Parent2("Poonam",50);
        Parent2 p2=new Parent2();
        System.out.println(ob.name + " " +ob.b);
        System.out.println(p2.name + " " +p2.b);
    }
    
}

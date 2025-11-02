public class NewClass7 {
    int x=30;
    static int y=40;
    public void display(){
        int r=x+y;
        System.out.println(r);
        
    
}
    public static void main(String[] args){
        NewClass7 obj=new NewClass7();
        NewClass7 obj2=new NewClass7();
        obj.x++;
        y++;
        obj.display();
        obj2.display();
    }
    
}

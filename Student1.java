class Student1{
    String name;
    int rollNumber;
    public Student1(String n,int r){
        name=n;
        rollNumber=r;}
    public void displayInfo(){
        System.out.println("Name:" +name);
        System.out.println("RollNumber:" +rollNumber);
        
    }
}
public class Main1 {
    public static void main(String[] args){
        Student1 s2=new Student1("Alice",101);
        s2.displayInfo();
    }
    
}

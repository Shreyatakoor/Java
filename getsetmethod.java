public class Person {
    private int age;
    public int getAge(){
        return age;
     } 

    public void setAge(int age){
        if(age>=0){
            this.age=age;
            System.out.println(age);
            
        }else{
             System.out.println("Invalid age");
        }
    }
     public static void main(String[] args){
         Person p1=new Person();
         p1.getAge();
         p1.setAge(60);
     }
}

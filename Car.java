class Car{
    String color;
    int speed;
    Car(String c,int s){
        color=c;
        speed=s;}
    void drive(){
        System.out.println(color + "car is driving at"+speed+"km/h");}
    }


public class Main {
    public static void main(String[] args){
        Car myCar=new Car("Red",120);
        myCar.drive();
         Car anotherCar=new Car("Blue",100);
        anotherCar.drive();
        
    }
    
}

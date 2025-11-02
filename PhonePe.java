class PhonePev1{
    int prop1=20;
    int prop2=15;
       void scannerButton(){
           System.out.println("top right");
           
       }
}
class PhonePeV2 extends PhonePev1{
    @Override
    void scannerButton(){
        System.out.println("update,bottom middle");
        
    }
    void newFeature(int money){
        System.out.println(money +" has been transferred");
    }
}
public class NewClass8 {
    public static void main(String[] args){
        PhonePeV2 child=new PhonePeV2();
        child.scannerButton();
        child.newFeature(500);
    }
    
}

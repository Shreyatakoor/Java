public class Amstrong {
    public static void main(String[] args){
        int n=153;//n=152,o/p:-Not an amstrong number.
        int original=n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        n=original;
        int sum=0;
        while(n>0){
            int last=n%10;
            int power=(int)Math.pow(last,count);
            sum+=power;
            n=n/10;
        }
        if(sum==original){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("Not an amstrong number");
        }
    }
    
}

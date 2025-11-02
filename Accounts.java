class Account {
    int Amount=0;
    public void withdrawal(){
        System.out.println("Amount withdrawn from account");
        
    }
    
}
class SavingsAccount extends Account{
    @Override
    public void withdrawal(){
        System.out.println("Amount deposited from savings account");
    }
}
class CurrentAccount extends Account{
    @Override
    public void withdrawal(){
        System.out.println("Amount deposited from current account");
    }
}
public class NewClass9{
    public static void main(String[] args){
        Account a=new Account();
        SavingsAccount s=new SavingsAccount();
        CurrentAccount c=new CurrentAccount();
        c.withdrawal();
        s.withdrawal();
        a.withdrawal();
    }
}

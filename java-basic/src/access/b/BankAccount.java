package access.b;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public 메서드 :deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액임");
        }
    }

    //public 메소드 : withdrw
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance-amount >= 0){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액 부족");
        }
    }

    public int getBalance(){
        return balance;
    }


    private boolean isAmountValid(int amount){
        return amount> 0;
    }
}

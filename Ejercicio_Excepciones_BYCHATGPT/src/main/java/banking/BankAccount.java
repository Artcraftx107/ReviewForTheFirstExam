package banking;

public class BankAccount implements DepositWithdraw{
    private String accountId;
    private double balance;

    public BankAccount(String id, double b){
        if (b<=0) {
            throw new InsufficientFundsException("User hasn't got enough money in their account");
        }else{
            this.accountId=id;
            this.balance=b;
        }
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double withdraw(double amount) {
        if(amount<=0){
            throw new InvalidDepositException("The amount to withdraw cannot be equal or lower than 0");
        }else if(amount>this.balance){
            throw new InsufficientFundsException("The user has less money than what was told to withdraw");
        }
        return this.balance-=amount;
    }

    @Override
    public double deposit(double amount) {
        if(amount<=0){
            throw new InvalidDepositException("The amount to deposit cannot be equal or lower than 0");
        }
        return this.balance+=amount;
    }

    @Override
    public String toString() {
        return "The account "+getAccountId()+" has a balance of $"+getBalance();
    }
}

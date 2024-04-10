package banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;
    private String accountsOwner;
    private double processes;
    public Bank(String n){
        if(n.isEmpty()){
            throw new IllegalArgumentException("The name of the owner of the accounts cannot be blank");
        }else{
            this.accountsOwner=n;
            this.accounts=new ArrayList<>();
        }
    }
    public double getAmount(){
        return processes;
    }
    public void setAmount(double amount){
        this.processes=amount;
    }

    public String getAccountsOwner() {
        return accountsOwner;
    }
    public void addAccount(BankAccount b){
       int pos = searchAccount(b.getAccountId());
       if(pos!=-1){
           accounts.set(pos, b);
       }else{
           accounts.add(b);
       }
    }
    public void removeAccount(BankAccount a){
        int pos = searchAccount(a.getAccountId());
        if(pos!=-1){
            accounts.remove(pos);
        }
    }

    public void withdrawFromAccountTo(BankAccount b, BankAccount a){
        int pos = searchAccount(b.getAccountId());
        int pos2 = searchAccount(a.getAccountId());
        double amount=this.processes;
        if(pos==-1 || pos2 == -1){
            throw new IllegalArgumentException("One of the accounts specified isn't on the list, use addAccount first");
        }else{
            accounts.get(pos).withdraw(amount);
            accounts.get(pos2).deposit(amount);
        }
    }
    public void depositFromAccount(BankAccount b, BankAccount a){
        int pos = searchAccount(b.getAccountId());
        int pos2 = searchAccount(a.getAccountId());
        double amount = this.processes;
        if(pos==-1||pos2==-1){
            throw new RuntimeException("One of the accounts specified isn't on the list, use addAccount(account) to add it");
        }else{
            accounts.get(pos).deposit(amount);
            accounts.get(pos2).withdraw(amount);
        }
    }
    public void withdrawAll(BankAccount a){
        a.withdraw(a.getBalance());
    }
    public void depositToAll(){
        for(int i = 0; i<accounts.size(); i++){
            accounts.get(i).deposit(this.processes);
        }
    }

    private int searchAccount(String accountId) {
        int found = 0;
        boolean gotten = false;
        while(found<this.accounts.size() && !gotten){
            if(this.accounts.get(found).getAccountId().equalsIgnoreCase(accountId)){
                gotten = true;
            }else{
                found++;
            }
        }
        if(!gotten){
            found = -1;
        }
        return found;
    }

    @Override
    public String toString() {
        return "The accounts of the bank "+this.accountsOwner+" are: "+accounts;
    }
}

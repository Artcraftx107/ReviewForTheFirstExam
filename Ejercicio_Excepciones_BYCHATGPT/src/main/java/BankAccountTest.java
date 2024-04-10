import banking.*;
public class BankAccountTest {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount("Manuel Carrasco", 2687.95);
        System.out.println(b1+"\n");
        b1.deposit(21);
        System.out.println(b1+"\n");
        b1.withdraw(249.99);
        System.out.println(b1+"\n");

    }
}

package pay_process;

public class PaypalProcessor implements PaymentProcessor{
    private String username;
    private double moneyInAccount;
    private double price;
    public PaypalProcessor(String user, double m, double p){
        if (user == "") {
            throw new IllegalArgumentException("Username cannot be empty");
        } else if (m<=0) {
            throw new IllegalArgumentException("The specified user has no money in their account");
        } else if (p<=0) {
            throw new IllegalArgumentException("The amount to be paid cannot be equal or lower than $0");
        }else {
            this.moneyInAccount=m;
            this.price=p;
            this.username=user;
        }
    }

    @Override
    public double processPayment(double amount) {
        double moneyLeftInAccount;
        if(this.moneyInAccount<amount){
            throw new RuntimeException("The specified user does not have enough money to pay for this product");
        }else{
            moneyLeftInAccount=this.moneyInAccount-amount;
        }
        return moneyLeftInAccount;
    }

    @Override
    public String toString() {
        return "After paying $"+this.price+" using PayPal, the user "+this.username+" has $"+processPayment(this.price)+" left";
    }
}

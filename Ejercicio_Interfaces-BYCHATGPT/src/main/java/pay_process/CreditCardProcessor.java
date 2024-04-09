package pay_process;

public class CreditCardProcessor implements PaymentProcessor{
    private int creditCardId;
    private String date;
    private double currentMoneyInCard;
    private double price;
    public CreditCardProcessor(int id, String date, double m, double p){
        if(id<=0 || date.isEmpty() || p<=0){
            throw new IllegalArgumentException("One of the values specified is not valid.");
        } else if (m<=0) {
            throw new RuntimeException("The card ID that has been given has no money");
        } else{
            this.creditCardId=id;
            this.date=date;
            this.currentMoneyInCard=m;
            this.price=p;
        }
    }

    public double getCurrentMoneyInCard() {
        return currentMoneyInCard;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public void setCurrentMoneyInCard(double currentMoneyInCard) {
        this.currentMoneyInCard = currentMoneyInCard;
    }

    @Override
    public double processPayment(double amount) {
        double moneyLeftAfterPurchase;
        if(this.currentMoneyInCard<amount){
            throw new RuntimeException("User cannot process the payment due to lack of enough money ("+this.currentMoneyInCard+") to pay the price of $"+amount);
        }else{
            moneyLeftAfterPurchase=currentMoneyInCard-amount;
        }
        return moneyLeftAfterPurchase;
    }

    @Override
    public String toString() {
        return "After making the purchase for an amount of $"+this.getPrice()+" the user now has $"+processPayment(this.price)+" left in their credit card.";
    }
}

import pay_process.*;
public class MainTest {
    public static void main(String[] args){
        PaypalProcessor paypal1 = new PaypalProcessor("SergiGamer", 2567.25, 200.0);
        CreditCardProcessor credit1 = new CreditCardProcessor(5123490, "10/04/2024", 1679.80, 500.0);
        System.out.println(paypal1+"\n");
        System.out.println(credit1+"\n");
    }
}

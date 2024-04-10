package banking;

public class InvalidDepositException extends RuntimeException{
    public InvalidDepositException(){
        super();
    }
    public InvalidDepositException(String msg){
        super(msg);
    }
}

public class CreditCard implements PaymentMethod{
    private String CardNumber;
    public CreditCard(){

    }
    public CreditCard(String cardNumber) {
        CardNumber = cardNumber;
    }
    @Override
    public void Pay(double amount){

    }
}

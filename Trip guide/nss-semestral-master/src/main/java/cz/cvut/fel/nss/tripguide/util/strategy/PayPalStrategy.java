package cz.cvut.fel.nss.tripguide.util.strategy;

/**
 * strategy for paypal payment
 * **/
public class PayPalStrategy implements PaymentStrategy {
    /**
     * do payment by paypal
     * @param amount total amount of order
     * **/
    @Override
    public String pay(int amount) {
        return (amount + " paid using Paypal.");
    }
}

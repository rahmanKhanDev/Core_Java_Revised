
//strategy inteface 
interface PaymentStrategy {
  // abstract method pay()
  public void pay(int amount);
}

// implementing stragety1
class CreditcardPayment implements PaymentStrategy {
  private String cardNumber;

  CreditcardPayment(String cardNumeber) {
    this.cardNumber = cardNumeber;
  }

  @Override
  public void pay(int amount) {
    System.out.println("paid " + amount + " amount using credit card " + cardNumber);
  }

}

// implementing stragety2
class PayPalPayment implements PaymentStrategy {
  private String email;

  PayPalPayment(String email) {
    this.email = email;
  }

  public void pay(int amount) {
    System.out.println("paid " + amount + " using PayPal account " + email);
  }
}

// implementing stragety3

class UpiPayment implements PaymentStrategy {
  private String email;

  UpiPayment(String email) {
    this.email = email;
  }

  public void pay(int amount) {
    System.out.println("paid " + amount + " using Up id " + email);
  }
}

// context class(will decide the stregety)
  class PaymentContext {
  // paymentStregtey obj
  private PaymentStrategy paymentStrategy;
  // set paymentStragey

  void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  // invoke pay() method (executing payment method)
  public void pay(int amount) {

    if (paymentStrategy == null) {
      System.out.println("Please select a payment method");
    } else {
      paymentStrategy.pay(amount);
    }
  }

}

// client class

public class Strategy {

  public static void main(String args[]) {
    PaymentContext context = new PaymentContext();

    // create payment method
    PaymentStrategy paymentStrategy1 = new CreditcardPayment("123-456-789");
    PaymentStrategy paymentStrategy2 = new UpiPayment("arkhan0055@gmail.com");
    PaymentStrategy paymentStrategy3 = new PayPalPayment("rahman123@gmail.com");

    // select payment method
    context.setPaymentStrategy(paymentStrategy1);
    // execute payment using CreditCard
    context.pay(670);
    System.out.println();

    System.out.println("Changing payment method ");
    context.setPaymentStrategy(paymentStrategy3);
    // execute payment using PaypalId
    context.pay(900);
    System.out.println();

    System.out.println("Changing payment method ");
    context.setPaymentStrategy(paymentStrategy2);
    context.pay(2000);

  }
}
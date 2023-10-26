package org.bellotech.eCommerceApp;

class PaymentProcessor {
	private String creditCardNumber;

	private String billingAddress;

	private String shippingAddress;

	// Getters and Setters for credit card information
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public class PaymentGateway extends Customer {

		public static boolean processPayment(String creditCardNumber, String
	  shippingAdress, String billingAdress) {
	  
	  PaymentProcessor paymentProcessor = new PaymentProcessor(); 
	  // set creditcard info 
	  paymentProcessor.setCreditCardNumber(creditCardNumber); 
	  // set shipping Address 
	  paymentProcessor.setShippingAddress(shippingAdress); 
	  // set billing address 
	  paymentProcessor.setBillingAddress(billingAdress); 
	  // process the payment 
	  boolean paymentSuccessful = paymentProcessor.processPayment(); 
	  // this will return the result of the paymrnt 
	  return paymentSuccessful;
	  
	  }

	}

	public boolean processPayment() {

		// this will return the result of the paymrnt
		return true;

	}
}

package org.patterns.facade;

public class Order {
	public void placeOrderFacadeMethod() {
        Product product = new Product();
        Payment payment = new Payment();
        Invoice invoice = new Invoice();

        product.getDetails();
        payment.payOnline();
        invoice.printInvoice();
    }
}

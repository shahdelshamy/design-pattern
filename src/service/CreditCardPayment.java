package service;

import api.PaymentMethod;

/*
 * OCP + LSP
 * Another implementation of PaymentMethod.
 */
public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}
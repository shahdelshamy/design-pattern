package service;

import api.PaymentMethod;

/*
 * OCP
 * Adding a new payment type without modifying other classes.
 *
 * LSP
 * Can substitute any PaymentMethod.
 */
public class CashPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paid using Cash");
    }
}
package org.factoryService;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService=new AService();
        paymentService.callMethod();
    }
}
package org.example.factoryService;

public class BService implements PaymentService {
    @Override
    public void callMethod() {
        System.out.println("Calling B");
    }
}

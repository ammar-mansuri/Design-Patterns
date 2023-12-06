package org.example.factoryService;


import org.springframework.context.annotation.Primary;

@Primary
public class AService implements PaymentService {
    @Override
    public void callMethod() {
        System.out.println("Calling A");
    }
}

package edu.acm.taller1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final SalesValidationService validationService;

    @Autowired
    public OrderService(SalesValidationService validationService) {
        this.validationService = validationService;
        System.out.println("OrderService creado");
    }

    public void verifySales() {
        System.out.println("Verifying sales...");
        validationService.registerSaleAfterOrder();
    }
}
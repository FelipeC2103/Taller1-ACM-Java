package edu.acm.taller1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    private final SalesValidationService validationService;

    @Autowired
    public InventoryService(SalesValidationService validationService) {
        this.validationService = validationService;
        System.out.println("InventoryService creado");
    }

    public void checkStock() {
        System.out.println("Revisando stock...");
        validationService.validateStockBeforeOrder();
    }
}
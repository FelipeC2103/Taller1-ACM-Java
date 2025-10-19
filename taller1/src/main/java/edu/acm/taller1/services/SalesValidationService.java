package edu.acm.taller1.services;

import org.springframework.stereotype.Service;

@Service
public class SalesValidationService {

    public void validateStockBeforeOrder() {
        System.out.println("Validando stock antes de registrar la orden...");
    }

    public void registerSaleAfterOrder() {
        System.out.println("Registrando venta después de procesar la orden...");
    }
}

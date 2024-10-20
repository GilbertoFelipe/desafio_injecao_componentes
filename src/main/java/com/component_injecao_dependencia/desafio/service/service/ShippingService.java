package com.component_injecao_dependencia.desafio.service.service;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double Frete(double valor) {
        if (valor < 100.00) {
            return 20.00;
        } else if (valor < 200.00) {
            return 12.00;
        } else {
            return 0.00;
        }
    }
}

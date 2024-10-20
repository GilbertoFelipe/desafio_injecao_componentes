package com.component_injecao_dependencia.desafio.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double calcularValorTotal(Pedido pedido) {

        double desconto = pedido.getValor() * (pedido.getPercentual() / 100);

        double valorComDesconto = pedido.getValor() - desconto;

        double frete = shippingService.Frete(pedido.getValor());

        return valorComDesconto + frete;
    }

    public void imprimirPedido(Pedido pedido) {
        double valorTotal = calcularValorTotal(pedido);
        System.out.printf("Pedido código %d%nValor total: R$ %.2f%n", pedido.getCodigo(), valorTotal);
    }
}

package com.component_injecao_dependencia.desafio.service.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class PedidoRunner implements CommandLineRunner {

    private final OrderService orderService;

    public PedidoRunner(OrderService orderService) {
        this.orderService = orderService;

    }

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do pedido: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o valor do pedido: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentual = scanner.nextDouble();

        Pedido pedido = new Pedido(codigo, valor, percentual);

        orderService.imprimirPedido(pedido);

        scanner.close();
        System.exit(0);
    }

}

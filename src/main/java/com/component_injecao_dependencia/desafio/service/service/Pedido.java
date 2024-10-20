package com.component_injecao_dependencia.desafio.service.service;

public class Pedido {

        private int codigo;
        private double valor;
        private double percentual;

        public Pedido(int codigo, double valor, double percentual) {
            this.codigo = codigo;
            this.valor = valor;
            this.percentual = percentual;
        }
        public int getCodigo() {
            return codigo;
        }
        public double getValor() {
            return valor;
        }
        public double getPercentual() {
            return percentual;
        }
}



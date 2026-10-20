package e1q4_pagamentos;

public class Main {
    public static void main(String[] args) {
        PagamentoService pix = new PagamentoService(new PagamentoPix());
        PagamentoService cartao = new PagamentoService(new PagamentoCartao(3000.0));
        PagamentoService boleto = new PagamentoService(new PagamentoBoleto());

        pix.pagar(2500.0);
        pix.pagar(6000.0);
        cartao.pagar(2500.0);
        cartao.pagar(3500.0);
        boleto.pagar(9000.0);
        boleto.pagar(12000.0);
    }
}

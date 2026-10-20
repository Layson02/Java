package e1q4_pagamentos;

public class PagamentoService {
    private final FormaPagamento formaPagamento;

    public PagamentoService(FormaPagamento formaPagamento) {
        if (formaPagamento == null) {
            throw new IllegalArgumentException("A forma de pagamento e obrigatoria.");
        }
        this.formaPagamento = formaPagamento;
    }

    public boolean pagar(double valor) {
        return formaPagamento.processar(valor);
    }
}

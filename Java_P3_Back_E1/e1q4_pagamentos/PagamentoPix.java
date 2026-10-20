package e1q4_pagamentos;

public class PagamentoPix implements FormaPagamento {
    private boolean valorValido(double valor) {
        return valor > 0 && valor <= 5000.0;
    }

    @Override
    public boolean processar(double valor) {
        boolean aprovado = valorValido(valor);
        System.out.println("PIX: " + (aprovado ? "pagamento aprovado." : "pagamento recusado."));
        return aprovado;
    }
}

package e1q4_pagamentos;

public class PagamentoCartao implements FormaPagamento {
    private final double limiteDisponivel;

    public PagamentoCartao(double limiteDisponivel) {
        if (limiteDisponivel < 0) {
            throw new IllegalArgumentException("Limite invalido.");
        }
        this.limiteDisponivel = limiteDisponivel;
    }

    private boolean valorValido(double valor) {
        return valor > 0 && valor <= limiteDisponivel;
    }

    @Override
    public boolean processar(double valor) {
        boolean aprovado = valorValido(valor);
        System.out.println("Cartao: " + (aprovado ? "pagamento aprovado." : "pagamento recusado."));
        return aprovado;
    }
}

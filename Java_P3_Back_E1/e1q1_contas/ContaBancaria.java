package e1q1_contas;

public class ContaBancaria {
    private Long id;
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(Long id, String titular, double saldoInicial) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.ativa = true;
    }

    private boolean valorValido(double valor) {
        return valor > 0;
    }

    public Long getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    private boolean possuiSaldoSuficiente(double valor) {
        return saldo >= valor;
    }

    public void depositar(double valor) {
        if (ativa && valorValido(valor)) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Depósito recusado. Conta inativa ou valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (ativa && valorValido(valor) && possuiSaldoSuficiente(valor)) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque recusado. Conta inativa, valor inválido ou saldo insuficiente.");
        }
    }

    public void ativar() {
        ativa = true;
        System.out.println("Conta ativada.");
    }

    public void desativar() {
        ativa = false;
        System.out.println("Conta desativada.");
    }

}
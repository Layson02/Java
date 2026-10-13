
// EXERCÍCIO 1 — Sistema de gerenciamento de contas bancárias
// Uma instituição financeira precisa desenvolver um sistema para controlar operações em
// contas bancárias. Crie uma classe ContaBancaria com os atributos:

// Requisitos obrigatórios:
// 1. Todos os atributos devem ser privados.
// 2. Crie um construtor que receba identificador, titular e saldo inicial.
// 3. Implemente os métodos públicos depositar(), sacar(), ativar() e desativar().
// 4. O saldo não poderá ser alterado diretamente por um setter.
// 5. Um depósito deverá ser recusado quando a conta estiver inativa ou o valor for inválido.
// 6. Um saque deverá ser recusado quando a conta estiver inativa, o valor for inválido ou o
// saldo for insuficiente.
// 7. Crie obrigatoriamente os dois métodos privados apresentados a seguir.
// 8. Os métodos públicos deverão utilizar esses métodos privados para realizar as validações.
// 9. Crie uma classe Main para demonstrar as operações.
// private boolean valorValido(double valor)
// private boolean possuiSaldoSuficiente(double valor)

package Java_P3_Back_E1.contas_bancárias;

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
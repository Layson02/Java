package e1q1_contas;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1L, "Layson V", 1000.0);

        conta.depositar(500.0); // Depósito válido
        conta.sacar(200.0); // Saque válido

        conta.desativar(); // Desativando a conta
        conta.depositar(300.0); // Depósito recusado (conta inativa)
        conta.sacar(100.0); // Saque recusado (conta inativa)

        conta.ativar(); // Ativando a conta novamente
        conta.sacar(1500.0); // Saque recusado (saldo insuficiente)

        conta.sacar(-50.0); // Saque recusado (valor inválido)
        conta.depositar(-300.0); // Depósito recusado (valor inválido)
    }
}

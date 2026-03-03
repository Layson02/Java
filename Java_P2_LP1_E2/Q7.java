import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome do funcionário:");
        String nome = entrada.nextLine();
        System.out.println("Número de horas trabalhadas:");
        double horas = entrada.nextDouble();
        System.out.println("Valor recebido por hora:");
        double valorHora = entrada.nextDouble();
        
        double salario = horas * valorHora;
        
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário final: " + salario);
    }
}
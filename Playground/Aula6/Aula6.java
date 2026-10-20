package aula6;
import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== PAINEL DA AULA 6 ===");
            System.out.println("1 - Código de Formatação (printf)");
            System.out.println("2 - Código de Média (Media.java)");
            System.out.println("3 - Código de Verificação de Número (Exercicio2.java)");
            System.out.println("4 - Código de Verificação de Nome (equals.java)");
            System.out.println("0 - Sair");
            System.out.print("Qual código você quer rodar? ");
            
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    Exercicio1.executar(); 
                    break;
                case 2:
                    Media.executar();
                    break;
                case 3:
                    Exercicio2.executar();
                    break;
                case 4:
                    equals.executar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    teclado.nextLine();
            }
        } while (opcao != 0);

        teclado.close();
    }
}

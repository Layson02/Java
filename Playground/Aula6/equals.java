package aula6;
import java.util.Scanner;

public class equals {
    public static void executar() {
        System.out.println("Digite 'Seiya', 'Camus', 'Shaka', 'Shiryu', 'Hyoga', 'Shun' ou 'Ikki' para apresentar suas constelações:");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        if (nome.equals("Seiya")) {
            System.out.println("Pégasus.");
        } else if (nome.equals("Camus")) {
            System.out.println("Aquario.");
        } else if (nome.equals("Shaka")) {
            System.out.println("Virgem.");    
        } else if (nome.equals("Shiryu")) {
            System.out.println("Dragão.");
        } else if (nome.equals("Hyoga")) {
            System.out.println("Cisne.");
        } else if (nome.equals("Shun")) {
            System.out.println("Andrômeda.");
        } else if (nome.equals("Ikki")) {
            System.out.println("Fênix.");
        } else {
            System.out.println("Nome não reconhecido. Por favor, digite um dos nomes mencionados.");
        }
        scanner.close();
    }
}

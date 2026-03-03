import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        String n1 = entrada.nextLine();
        System.out.println("Digite a segunda nota:");
        String n2 = entrada.nextLine();
        System.out.println("Digite a terceira nota:");
        String n3 = entrada.nextLine();
        
        double nota1 = Double.parseDouble(n1);
        double nota2 = Double.parseDouble(n2);
        double nota3 = Double.parseDouble(n3);
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Média: " + media);
    }
}
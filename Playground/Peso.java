import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu peso:");
        int peso = teclado.nextInt();
        
        if (peso <= 0) {
            System.out.println("Valor inválido! O peso deve ser maior que zero.");
        } else {
            System.out.println("O peso registrado foi: " + peso + " kg.");
        }
        
        teclado.close();
    }
}
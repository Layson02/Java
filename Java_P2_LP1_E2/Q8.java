import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Preço do produto:");
        double preco = entrada.nextDouble();
        System.out.println("Valor pago pelo cliente:");
        double valorPago = entrada.nextDouble();
        
        double troco = valorPago - preco;
        
        System.out.println("Troco a ser dado: " + troco);
    }
}
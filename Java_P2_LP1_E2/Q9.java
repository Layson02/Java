import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Base maior:");
        double baseMaior = entrada.nextDouble();
        System.out.println("Base menor:");
        double baseMenor = entrada.nextDouble();
        System.out.println("Altura:");
        double altura = entrada.nextDouble();
        
        double area = ((baseMaior + baseMenor) / 2) * altura;
        
        System.out.println("Área do trapézio: " + area);
    }
}
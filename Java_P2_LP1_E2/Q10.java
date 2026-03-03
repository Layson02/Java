import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Temperatura em Fahrenheit:");
        double fahrenheit = entrada.nextDouble();
        
        double celsius = ((fahrenheit - 32) / 9) * 5;
        
        System.out.println("Temperatura em Celsius: " + celsius);
    }
}
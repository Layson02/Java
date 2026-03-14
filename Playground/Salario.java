import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        final double salariominimo = 1621.00;
        
        System.out.println("Digite o seu salario:");
        Scanner teclado = new Scanner(System.in);
        double salario = teclado.nextDouble();
        
        if (salario < salariominimo) {
            System.out.println("Atenção: Seu salário está abaixo do mínimo legal.");
        } else if (salario == salariominimo) {
            System.out.println("Você recebe exatamente um salário mínimo.");
        } else {
            double diferenca = salario - salariominimo;
            System.out.println("A diferença entre o seu salário e o mínimo é de R$ " + diferenca);
        }
        
        teclado.close();
    }
}
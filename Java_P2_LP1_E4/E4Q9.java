import java.util.Scanner;

public class E4Q9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite dois números:");
        String continuar;
        do {
            double n1 = teclado.nextDouble();
            double n2 = teclado.nextDouble();
            System.out.println("Soma: " + (n1 + n2));
            System.out.println("Sub: " + (n1 - n2));
            System.out.println("Mult: " + (n1 * n2));
            System.out.println("Div: " + (n1 / n2));
            System.out.println("Deseja continuar?");
            System.out.println("Digite 'sim' para continuar ou qualquer outra coisa para sair.");
            continuar = teclado.next();
        } while (continuar.equalsIgnoreCase("sim"));

        teclado.close();
    }
}

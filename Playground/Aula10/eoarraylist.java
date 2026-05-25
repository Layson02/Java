import java.util.ArrayList;
import java.util.Scanner;

public class eoarraylist {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            String nome = teclado.nextLine();
            nomes.add(nome);
        }

        System.out.println("Nomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        teclado.close();
    }
}

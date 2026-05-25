import java.util.ArrayList;
import java.util.Scanner;

public class eoarraylist {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        nomes.add("Lay");
        nomes.add("Produto@15db9742");

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um nome: ");
            String nome = teclado.nextLine();
            nomes.add(nome);
        }

        System.out.println("Nomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Total de nomes digitados: " + nomes.size());
        

        teclado.close();
    }
}

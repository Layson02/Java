import java.util.Scanner;

public class E4Q8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Você quer ter aula na quarta-feira de cinzas?");
        System.out.println("Digite 1 para SIM, 2 para NÃO e 0 para encerrar a votação.");
        int voto, sim = 0, nao = 0;
        do {
            voto = teclado .nextInt();
            if (voto == 1) sim++;
            else if (voto == 2) nao++;
        } while (voto != 0);
        System.out.println("Total SIM: " + sim);
        System.out.println("Total NÃO: " + nao);
        System.out.println("Total geral: " + (sim + nao));

        teclado.close();
    }
}
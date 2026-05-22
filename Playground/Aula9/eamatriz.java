import java.util.Scanner;

public class eamatriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int linha = 0 ; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite um número para a posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = teclado.nextInt();
            }
        }

        System.out.println("Matriz digitada:");
        for (int linha = 0 ; linha < matriz.length; linha++) {
            System.out.print(" | ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println(" | ");
        }
        teclado.close();
    }
}
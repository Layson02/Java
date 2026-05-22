import java.util.Scanner;

public class E6Q3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        
        int maiorValor = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite um número para a posição [" + linha + "][" + coluna + "]: ");
                
                while (!teclado.hasNextInt()) {
                    System.out.println("Entrada inválida! Digite apenas números inteiros.");
                    System.out.print("Digite um número para a posição [" + linha + "][" + coluna + "]: ");
                    teclado.next();
                }
                
                matriz[linha][coluna] = teclado.nextInt();
                
                if (matriz[linha][coluna] > maiorValor) {
                    maiorValor = matriz[linha][coluna];
                    linhaMaior = linha;
                    colunaMaior = coluna;
                }
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print("| ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("%5d ", matriz[linha][coluna]);
            }
            System.out.println(" |");
        }

        System.out.println("\nMaior valor contido na matriz: " + maiorValor);
        System.out.println("Posicao: [" + linhaMaior + "][" + colunaMaior + "]");

        teclado.close();
    }
}
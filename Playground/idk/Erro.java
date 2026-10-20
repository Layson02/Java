package idk;

import java.util.Scanner; 

public class Erro {
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = teclado.nextInt();
        teclado.nextLine(); 

        System.out.println("Digite um nome: ");
        String nome = teclado.nextLine();
                
        System.out.println("Número digitado: " + n1);
        System.out.println("Nome digitado: " + nome);

        teclado.close();
    }
}
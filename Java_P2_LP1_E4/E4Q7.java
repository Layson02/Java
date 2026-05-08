import java.util.Scanner;

public class E4Q7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha = "";
        while (!senha.equals("naodigo")) {
            System.out.println("Você não sabe a senha! =P");
            System.out.println("Você nunca alcançará a verdade! ");
            System.out.println("You will never reach the truth! ");
            senha = teclado.nextLine();
            
        }
        System.out.println("Senha correta! num olha a string não pow.");
        
        teclado.close();
    }
}

import java.util.Scanner;
public class Aula1 {
	
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			
			System.out.print("Qual é o seu nome? ");
			String nome = entrada.nextLine();

			System.out.print("Qual seu sobrenome? ");
			String sobrenome = entrada.nextLine();
			
			String idade = "Sem idade"; 
            
            try {
    		System.out.print("Qual sua idade? ");
    		String entradaDigitada = entrada.nextLine();
    
    
    		Integer.parseInt(entradaDigitada); 
    
    
    		idade = entradaDigitada; 

			} catch (NumberFormatException e) {
    			System.err.println("Erro: Entrada inválida. A idade deve ser um número inteiro.");
			}

			System.out.println("O seu nome completo é: " + nome + " " + sobrenome);
			System.out.println("A sua idade é: " + idade);

			
		}
		entrada.close();
	}

}
import java.util.Calendar;
import java.util.Scanner;

public class Q3 {
    public static void main(String[]args) {
        System.out.println("Qual seu ano de nascimento?");
        Scanner entrada = new Scanner(System.in);
        int nascimento = entrada.nextInt();

            Calendar c1 = Calendar.getInstance();
            int ano = (c1.get(Calendar.YEAR));
            System.out.println("Sua idade é " + (ano - nascimento));    
        }
    }

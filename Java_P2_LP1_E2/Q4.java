import java.time.LocalDate;
import java.util.Scanner;

 public class Q4 {
     public static void main (String[] args) {
         System.out.println(("Ano do nascimento? "));
         Scanner entrada = new Scanner(System.in);
         int ano = entrada.nextInt();
         LocalDate l1 = LocalDate.now();
         int anoatual = l1.getYear();
         int idade = (anoatual - ano);
         System.out.println("Sua idade é " + idade);
     }

}
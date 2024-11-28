import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class AboutMe {
  public static void main(String[] args) {
    
    try {
      // criando o objeto scanner para capturar a entrada do usuário
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Digite seu nome: ");
      String nome = scanner.next();
  
      System.out.println("Digite seu sobrenome");
      String sobrenome = scanner.next();
  
      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();
  
      System.out.println("Digite sua altura: ");
      double altura = scanner.nextDouble();
  
      System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
      System.out.println("Tenho " + idade + " anos " );
      System.out.println("Minha altura é " + altura + "cm");
      scanner.close();

    } catch (InputMismatchException e) {
      System.out.println("O campo idade e altura precisam ser do tipo número, erro: " + e);
    }
  }
}

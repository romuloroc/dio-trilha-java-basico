import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // conhecer e inportar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir mensagem para o nosso usuário
        System.out.println("Bem vindo ao Banco da DIO");
        System.out.println("Vamos criar uma conta para você");

        // Obter pelo scanner os valores digitados no terminal
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        
        double saldo = 237.48;
        
        // Exibir a mensagem conta criada
        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponível para saque.");
        
        // Close the scanner
        scanner.close();
    }
}

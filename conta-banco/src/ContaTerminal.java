import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o código da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo de sua conta!");
        double saldo = scanner.nextDouble();
        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}

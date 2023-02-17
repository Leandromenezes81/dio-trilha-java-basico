import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.next();

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Por favor, digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");
    }
}

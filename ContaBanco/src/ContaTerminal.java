
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta !");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo !");
        double saldo = scanner.nextDouble();

        NovaConta conta = new NovaConta(nomeCliente, agencia, numeroConta, saldo);
        conta.exibirMensagem();

        scanner.close();

       
    }
}

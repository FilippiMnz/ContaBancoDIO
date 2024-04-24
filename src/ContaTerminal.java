import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e armazenar informações da conta
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}

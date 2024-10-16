import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeDoCliente;
        double saldo;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("digite o número da conta: ");
            numero = Integer.parseInt(scanner.nextLine());

            System.out.println("digite o número da agência: ");
            agencia = scanner.nextLine();

            System.out.println("digite o nome do cliente: ");
            nomeDoCliente = scanner.nextLine();

            System.out.println("digite o saldo inicial: ");
            saldo = Double.parseDouble(scanner.nextLine());

            System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}

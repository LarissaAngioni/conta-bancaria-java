import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo R$%,.2f já está disponível para saque.", nomeCompleto, numeroAgencia, numeroConta, saldo);
    }
}

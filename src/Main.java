import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o seu nome: ");
        conta.nome = sc.nextLine();
        System.out.println("Por favor, digite o número da agência!");
        conta.agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta!");
        conta.numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o saldo da conta!");
        conta.saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                conta.nome, conta.agencia, conta.numeroConta, conta.saldo );
    }
}
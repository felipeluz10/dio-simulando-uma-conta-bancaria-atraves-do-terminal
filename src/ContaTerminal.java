import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //solicitar agencia do terminal e ler o valor digitado
    System.out.println("Por favor, digite o numero da Agencia:");
    String agencia = sc.nextLine();

    //solicitar numero da conta do terminal e ler o valor digitado
    System.out.println("Por favor, digite o numero da Conta:");
    int numero = sc.nextInt();

    sc.nextLine();

    //solicitar nome do cliente do terminal e ler o valor digitado
    System.out.println("Por favor, digite o nome do cliente:");
    String nomeCliente = sc.nextLine();


    //solicitar saldo da conta do terminal e ler o valor digitado
    System.out.println("Por favor, digite o saldo da conta:");
    double saldo = sc.nextDouble();

    sc.nextLine(); 
  
    String msg = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
    nomeCliente, agencia, numero, saldo);

    System.out.println(msg);


    sc.close();
  }
  
}

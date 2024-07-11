import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan  = new Scanner(System.in);
        
        int contabancaria;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Olá, bem vindo ao NeXtBank!");
        System.out.println("Para iniciar o cadastro digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Muito bem, agora digite o número da sua conta: ");
        contabancaria = scan.nextInt();

        System.out.println("ok, agora digite a agencia: ");
        agencia = scan.next();

        System.out.println("Olá " + nome + "!\nObrigado por criar uma conta em nosso banco, sua agência é " + agencia 
        + ", conta " + contabancaria + " e seu saldo já está disponível para saque.");
    }
}

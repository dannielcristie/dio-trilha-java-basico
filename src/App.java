import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //System.out.println("Crie uma conta bancaria");
        
        System.out.print("Digte o numero da conta: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a agência: ");
        String agency = sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String name = sc.nextLine();

        System.out.print("Digite o saldo: ");
        double balance = sc.nextDouble();

        Conta conta = new Conta(number, agency, name, balance);

        System.out.println(conta);

        sc.close();
    }
}

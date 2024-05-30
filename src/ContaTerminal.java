import model.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a conta: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe a agencia: ");
        String agency = sc.nextLine();
        System.out.println("Informe seu nome: ");
        String name = sc.nextLine();
        System.out.println("Informe seu saldo: ");
        Double balance = sc.nextDouble();

        ContaBanco con = new ContaBanco(number, agency, name, balance);
        System.out.println(con);

        sc.close();
    }
}

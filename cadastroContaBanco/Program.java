package cadastroContaBanco;

import cadastroContaBanco.entities.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ContaBanco contaBanco;

        System.out.println("enter account number: ");
        int number = scanner.nextInt();
        System.out.println("enter account holder ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.println("is there an initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value");
            double initialDeposit = scanner.nextDouble();
            contaBanco = new ContaBanco(number, holder, initialDeposit);
        }
        else {
            contaBanco = new ContaBanco(number,holder);
        }

        System.out.println();
        System.out.println("Account data");
        System.out.println(contaBanco);
        System.out.println();
        System.out.println("enter deposite value: ");
        double depositValue = scanner.nextDouble();
        contaBanco.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(contaBanco);

        System.out.println();
        System.out.println("enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        contaBanco.deposit(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(contaBanco);

        scanner.close();
    }
}
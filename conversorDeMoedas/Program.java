package conversorDeMoedas;

import conversorDeMoedas.entities.ConversorDollar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ConversorDollar conversorDollar = new ConversorDollar();

        System.out.println("what is the dollar price? ");
        conversorDollar.dollarValue = scanner.nextDouble();

        System.out.println("how many dollars will be bought?");
        conversorDollar.quantityDollar = scanner.nextDouble();

        double dolarLocal = ConversorDollar.convertDollar(conversorDollar.dollarValue,conversorDollar.quantityDollar);
        System.out.printf("amount to be paid in reais = %.2f%n",dolarLocal);


    }
}

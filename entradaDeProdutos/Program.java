package entradaDeProdutos;

import programaMediAltura.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicionando produtos em stoke: ");
        int n = scanner.nextInt();
        Product[]vect = new Product[n];
        for (int i = 0;i<vect.length;i++){
            scanner.nextInt();
            String name = scanner.nextLine();
             double price = scanner.nextDouble();
             vect[i] = new Product(name,price);
        }

        double sum =0.0;
        for(int i=0;i<0;i++){
            sum += vect[i].getPrice();
        }
        double avg = sum /vect.length;
        System.out.printf("AVERAGE PRICE : %.2fn% ",avg);


        scanner.close();
    }
}

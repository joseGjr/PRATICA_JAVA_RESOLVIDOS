package programaMediAltura;

import programaMediAltura.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Product []vetor = new Product[n];

        for (int i =0;i< vetor.length;i++){
            scanner.nextLine();
            String name = scanner.nextLine();
            double  price = scanner.nextDouble();
            vetor[i] =new Product(name,price);
        }
        double soma = 0.0;
        for (int i =0;i< vetor.length;i++){
            soma   += vetor[i].getPrice();
        }
        double avg = soma/ vetor.length;
        System.out.printf("average price = %.2f%n",avg);




        scanner.close();
    }
}
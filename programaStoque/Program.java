package programaStoque;

import programaStoque.entities.Stoke;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Stoke stoke = new Stoke();

        System.out.println("enter product data: ");
        System.out.println("name product: ");
        stoke.setName(scanner.next());
        System.out.println("price: ");
        stoke.setPrice(scanner.nextDouble());
        System.out.println("Quantity: ");
        stoke.setQuantity(scanner.nextInt());


        System.out.println("Produto: "+stoke.getName() +"R$: "+stoke.getPrice() +"Quantidade em stok: "+ stoke.getQuantity() );

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        stoke.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data"+ stoke);

        System.out.println();

        System.out.println("Enter the number of products to be removed from stock ");
        quantity = scanner.nextInt();
        stoke.removeProducts(quantity);
        System.out.println("updated data Products in stok"+stoke.toString());
        scanner.close();

    }
}

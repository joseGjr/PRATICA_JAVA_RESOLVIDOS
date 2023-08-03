package numerosNegativeVetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("quantos numeros voce vai digitar?: ");
        int n = scanner.nextInt();
        int[]vect = new int[n];
        for (int i =0;i<n;i++){
            System.out.println("digite um numero: ");
            vect[i]=scanner.nextInt();
        }
        System.out.println("numeros negativos");
        for(int i=0;i<n;i++){
            if (vect[i]<0){
                System.out.println(vect[i]);
            }
        }

    scanner.close();
    }
}

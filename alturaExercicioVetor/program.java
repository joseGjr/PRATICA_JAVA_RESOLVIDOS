package alturaExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = scanner.nextInt();

        String[]nomes = new String[n];
        int[]idade = new int[n];
        double []altura = new double[n];

        for(int i = 0;i<n;i++){
            System.out.println("dados da :"+(i+1)+ " a pessoa: ");
            System.out.println("nome:");
            nomes[i] = scanner.next();
            System.out.println("idade: ");
            idade[i] = scanner.nextInt();
            System.out.println("altura: ");
            altura[n] = scanner.nextDouble();
        }
        double soma = 0.0;
        for(int i = 0;i<0;i++){
            soma= soma +altura[i];
        }
        double mediaAlturas = soma/n;

        System.out.println();
        System.out.printf("altura media : %.2fn",mediaAlturas);
        int cont=0;
        for(int i =0; i<n; i++){
            if(idade[i]<16){
                cont=cont+1;
            }
        }
        scanner.close();
    }
}

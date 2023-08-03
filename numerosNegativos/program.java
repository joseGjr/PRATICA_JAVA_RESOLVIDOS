package numerosNegativos;

import numerosNegativos.entities.BaseNumeros;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

       double []altura = new double[n];
       for(int i=0;i<n;i++){
          altura[i] =   scanner.nextDouble();

        }
       double sum = 0.0;
       for (int i=0; i<n;i++){
           sum+=altura[i];
       }
       double avg = sum/n;
        System.out.printf("AVARAGE HEIGHT:%.2f%n ",avg);
       scanner.close();
         }
    }

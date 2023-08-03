package application;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {
 /*
        System.out.println("end program");

  */
        System.out.println("metodo 2 is start");
            method2();
             method1();
    }

    private static void method2() {
        Scanner scanner = new Scanner(System.in);
        try {
            String []vetor = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vetor[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid position");
        }
        catch (InputMismatchException e){
            System.out.println("input error");
        }
        scanner.close();
        System.out.println("metodo 2 end");
    }
    public static void method1(){
        System.out.println("start method 1");
        method2();
        System.out.println("end method 1");
    }
}
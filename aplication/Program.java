package aplication;

import aplication.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("circumference:%.2f%n",c);
        System.out.printf("volume:%.2f%n",v);
        System.out.printf("PI volume:%.2f%n",PI);

        scanner.close();
    }

}

package folhaFuncionarioExercicio;

import folhaFuncionarioExercicio.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Nome: ");
        employee.name = scanner.next();
        System.out.println("Gross salary: ");
        employee.grossSalary=scanner.nextDouble();
        System.out.println(employee.toString());
        System.out.println("which percentage to increase salary?");
        employee.porcentage=scanner.nextDouble();


    }
}

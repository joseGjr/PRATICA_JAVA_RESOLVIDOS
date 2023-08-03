package folhaFuncionarioExercicio.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax = 1000;

    public double porcentage;


    public Employee(Integer id, String name, Double salary) {
    }

    public Employee() {

    }

    public double netSalary(){
        return grossSalary - tax;
    }
    public double increaseSalary(double porcentage){
        return  grossSalary * ((grossSalary * porcentage) - tax);
    }



}

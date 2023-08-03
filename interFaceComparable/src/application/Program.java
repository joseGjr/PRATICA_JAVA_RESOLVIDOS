package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {
      List<Employee> list = new ArrayList<>();
      String path ="C:\\in.txt";
      try (BufferedReader br = new BufferedReader(new FileReader(path))){
          String employeeCsv = br.readLine();
          while(employeeCsv!=null){
              String[]filds = employeeCsv.split(",");
              list.add(new Employee(filds[0],Double.parseDouble(filds[1])));
              employeeCsv = br.readLine();
          }
          Collections.sort(list);
          for(Employee emp:list){
              System.out.println(emp.getName()+","+emp.getSalary());
          }
      }
      catch(IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
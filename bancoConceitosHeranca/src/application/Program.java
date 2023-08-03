package application;

import entites.Account;
import entites.BusinessAccount;
import entites.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Account> list = new ArrayList<>();
       list.add(new SavingsAccount(1001,"alexe",500.00,0.01));
       list.add(new BusinessAccount(1041,"Mexe",503.00,0.14));
       list.add(new SavingsAccount(1031,"Mexe",503.00,0.14));
    double sum = 0.0;
    for(Account acc:list){
        sum+= acc.getBalance();
    }
        System.out.printf("total balance: %.2f%n",sum);

    for (Account acc:list){
        acc.deposit(10.0);
    }
    for (Account acc:list){
            System.out.printf("update balance for account %d: %.2f%n",acc.getNumber(),acc.getBalance());
        }
    }
}

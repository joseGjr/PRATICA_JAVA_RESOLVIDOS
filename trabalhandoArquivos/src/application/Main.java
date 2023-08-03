package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.hasNextLine());
            }
        }catch (IOException e){
            System.out.println("error"+e.getMessage());
        }
        finally {
            if (sc!=null){
                sc.close();

            }

        }
    }
}
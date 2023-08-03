package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public  class ProgramTryCatchFinaly {
    public static void main(String[] args) {
        File file = new File("C:\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.hasNextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("|Error openig file:"+e.getMessage());
        }
        finally{
            if (sc!= null){
                sc.close();
            }
            System.out.println("finally block executed");
        }
    }

}

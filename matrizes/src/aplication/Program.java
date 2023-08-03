package aplication;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] mat = new int[n][n];
        for(int i = 0;i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                mat[i][j]= scanner.nextInt();
            }
        }
        System.out.println("main diagonal: ");
        for(int i=0;i<mat.length;i++){
            System.out.println(mat[i][i]+" ");
        }
        int count = 0;
        for(int i = 0;i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                if(mat[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers:" +count);

        scanner.close();
        }
    }
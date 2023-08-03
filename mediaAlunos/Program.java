package mediaAlunos;

import mediaAlunos.entities.AlunosNotas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        AlunosNotas alunosNotas = new AlunosNotas();
        System.out.println("nome do aluno: ");
        alunosNotas.aluno = scanner.next();
        System.out.println("1º nota ");
        alunosNotas.nota = scanner.nextDouble();
        System.out.println("2º nota ");
        alunosNotas.nota2 = scanner.nextDouble();
        System.out.println("3º nota ");
        alunosNotas.nota3 = scanner.nextDouble();
        if (alunosNotas.soma()<=60){
            System.out.println("reprovado, você esta abaixo da média "+alunosNotas.soma());
        }else{
            System.out.println("Aprovado, você esta dentro da média "+alunosNotas.soma());

        }

    }
}

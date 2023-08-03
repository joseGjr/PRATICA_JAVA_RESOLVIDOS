package retanguloMedidasExercicio;

import retanguloMedidasExercicio.entities.RetanguloMedia;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        RetanguloMedia retanguloMedia = new RetanguloMedia();

        System.out.println("ENTER COM RETANGULO WIDTH AND HEIGHT: ");
        System.out.println("whidt: ");
        retanguloMedia.width = scanner.nextDouble();

        System.out.println("height: ");
        retanguloMedia.height = scanner.nextDouble();
        System.out.println(retanguloMedia.toString());


    }
}

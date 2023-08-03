package application;

import java.io.*;

public class ProgramWriter {
    public static void main(String[] args) {
        String[]lines = new String[]{"good mornig","good afternoon","good night"};
        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for(String line : lines){
            bw.write(line);
            bw.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

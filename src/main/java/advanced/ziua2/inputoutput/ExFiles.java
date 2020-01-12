package main.java.advanced.ziua2.inputoutput;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExFiles {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\User\\Desktop\\cuvinte.txt");
        boolean exists= Files.exists(path);
        if(exists){
           /* List<String> lines = Files.readAllLines(path);
        }
            for (int i = 0; i < lines.size(); i++) {
                System.out.println("Line " + i + " has content " + lines.get(i));
            try {
                strings = Files.readAllLines(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            List<String> lines= strings;
*/
        }

    }
}

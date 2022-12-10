package JavaProg.HW.hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class t1 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("text.txt");
        List<String> lines = Files.readAllLines(file);
        System.out.println(lines);
    }
        
    }
    



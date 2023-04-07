package family_02_structural.dp_02_decoration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App2 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/users/moshe/myfile.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    }
}
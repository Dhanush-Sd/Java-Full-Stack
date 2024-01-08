package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingInMethod {
    void createAndwrite()throws IOException{
        File f = new File("sampleFileInMethod.txt");
        boolean b = f.createNewFile();
        System.out.println(b);
        FileWriter fw = new FileWriter(f);
        fw.write("hey dhanush");
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        FileHandlingInMethod fh = new FileHandlingInMethod();
        fh.createAndwrite();
    }
}

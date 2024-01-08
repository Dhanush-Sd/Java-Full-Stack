package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ThrowsKeyword {
    public static void main(String[] args) throws IOException {
        File f = new File("sampleFile-Throws.txt");
        boolean b = f.createNewFile();
        System.out.println(b);
        FileWriter fw = new FileWriter(f);
        fw.write("hello dhanush");
        fw.close();
    }
}

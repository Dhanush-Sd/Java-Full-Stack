package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class FileReaderClass {
    static void createAndwrite()throws IOException{
        File f = new File("sampleFileInMethod.txt");
        boolean b = f.createNewFile();
        System.out.println(b);
        FileWriter fw = new FileWriter(f);
        fw.write("hey dhanush");
        fw.close();
    }
    static void read() throws IOException{
        File f = new File("sampleFileInMethod.txt");
        FileReader fr = new FileReader(f);
        char x[] = new char[15];
        fr.read(x);
        System.out.println(x);
    }

    public static void main(String[] args)throws IOException {
        read();
    }

}

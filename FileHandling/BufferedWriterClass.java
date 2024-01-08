package FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sampleFileCreation-FileClass.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hi Dhanush.How are You?");
        bw.close();
    }
}

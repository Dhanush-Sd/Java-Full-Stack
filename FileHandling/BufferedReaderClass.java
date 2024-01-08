package FileHandling;
import java.io.*;


public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("sampleFileCreation-FileClass.txt");
        BufferedReader br = new BufferedReader(fr);
        int i = 0;
        while((i = br.read())!= -1){
            System.out.println((char)i);
        }
        br.close();

    }
}

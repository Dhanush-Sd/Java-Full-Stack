package FileHandling;
import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) {
        File f = new File("sampleFileCreation-FileClass.txt");
        boolean b = false;
        try{
            b = f.createNewFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
        System.out.println(b);
    }
}

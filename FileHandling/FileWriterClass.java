package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
        File f = new File("SampleFile-Filewriter.txt");
        boolean b = false;
        FileWriter fw = null;
        try{
            b = f.createNewFile();
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println(b);
        try{
            fw = new FileWriter(f);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        try{
            fw.write("Hi Dhanush");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        try{
            fw.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

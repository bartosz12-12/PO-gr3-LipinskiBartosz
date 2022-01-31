import java.io.File;
import java.util.Arrays;
public class Zad3 {
    public static void main(String[] args)
    {
        String ar = "src/bartek";
        String[] files = fileList(ar,"html");
        for (String s:files){
            System.out.println(s);
        }
    }
    public static String[] fileList(String ar, String ex)
    {
        File file = new File(ar);
        return file.list(((dir,name)->!name.endsWith(ex)));
    }
}

import java.io.File;
import java.io.IOException;

public class first {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\chach\\Documents\\record.txt");
        try {
            if (file.createNewFile()){
                System.out.println("file create");
            }
            else {
                System.out.println("file not create");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

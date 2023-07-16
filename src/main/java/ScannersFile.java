import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class ScannersFile {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader("src/main/resources/file.txt");
        Scanner sc = new Scanner(fr);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}

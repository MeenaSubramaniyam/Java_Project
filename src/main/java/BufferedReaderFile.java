import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/main/resources/file.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}

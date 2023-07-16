import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class BufferedReaders {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the input string");
        InputStreamReader ip =  new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ip);
        String str = bf.readLine();
        System.out.println("The entered string is " +str);

        System.out.println("Enter the input integer");
        int num = Integer.parseInt(bf.readLine());
        System.out.println("The entered integer is " +num);

    }
}

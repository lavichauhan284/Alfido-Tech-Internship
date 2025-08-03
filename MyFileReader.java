import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) {
        //file name
        String fileName = "data.txt";

        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    }

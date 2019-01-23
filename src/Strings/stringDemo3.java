package Strings;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;


/*  
 * This is good when reading a large amount of data into a string.
 * Useful when sorting and searching data.
 */

public class stringDemo3 {
    public static void main(String[] args) throws FileNotFoundException {
        String fullText = "";
        try {
            FileReader myReader = new FileReader(new File("C:\\Users\\alema\\Code\\hands-on-data-structures-and-algorithms-practice\\src\\Strings\\dummy.txt"));
            Scanner scan = new Scanner(myReader);
            while(scan.hasNext()){
               fullText += (scan.nextLine() +  "\n");
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
        System.out.println(fullText);
    }
}

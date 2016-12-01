import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by lsr on 2016/11/24.
 */
public class Main {
    public static void main(String[] args){
//        try {
//            Parser parser = new Parser();
//
//            File file = new File("./src/test.txt");
//
//            Scanner scanner = new Scanner(new FileInputStream(file));
//            int i = 0;
//            while (scanner.hasNextLine()) {
//                i++;
//                if (parser.syntax(scanner.nextLine()) == false) {
//                    System.out.println(i);
//                }
//            }
//        }catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        String op = "SELECT * FROM course WHERE (exam + homework) = 200";
        Parser parser = new Parser();
        parser.syntax(op);


    }
}

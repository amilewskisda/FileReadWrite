import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {

    public static void createFile(String fileName) {
        File file = new File(fileName + ".txt");
    }

    public static void save(String fileName, String text) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(fileName + ".txt");
        printWriter.println(text);
        printWriter.close();
    }

    public static String readSentence(String fileName) throws FileNotFoundException {
        File file = new File(fileName + ".txt");
        Scanner in = new Scanner(file);
        String sentence = in.nextLine();
        return sentence;
    }
}

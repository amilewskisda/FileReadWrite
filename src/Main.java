import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String filePath = "C:/AndroidWorkspace/hello.txt";
        FileManager fileManager = new FileManager(filePath);
        fileManager.initReaderWriter();

        try {
            // folder AndroidWorkspace should already exist
            fileManager.save("MyText MyText MyText MyText MyText MyText MyText");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileManager.closeBufferedWriter();
        }

        try {
            //String sentence = FileManager.readSentence();
            String sentence = fileManager.readWholeFile();
            System.out.println(sentence);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileManager.closeBufferedReader();
        }

        fileManager.delete();
    }
}

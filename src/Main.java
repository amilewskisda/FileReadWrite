import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            FileManager.save("MyTextFile", "MyText MyText MyText MyText MyText MyText MyText");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String sentence = FileManager.readSentence("MyTextFile");
            System.out.println(sentence);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

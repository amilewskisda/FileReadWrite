import java.io.*;

public class FileManager {

    private String filePath;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public void initReaderWriter() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
            bufferedReader = new BufferedReader(new FileReader(filePath));
            //bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(String text) throws IOException {
       // bufferedWriter.write(text); // look at initReaderWriter
        bufferedWriter.append(' ');
        bufferedWriter.append(text);
    }

    public String readSentence() throws IOException {
        String currentLine = bufferedReader.readLine();
        return currentLine;
    }

    public String readWholeFile() throws IOException {
        StringBuilder builder = new StringBuilder();
        String currentLine = bufferedReader.readLine();
        while (currentLine != null) {
            builder.append(currentLine);
            builder.append("\n");
            currentLine = bufferedReader.readLine();
        }
        return builder.toString();
    }

    public void closeBufferedReader() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeBufferedWriter() {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        File file = new File(filePath);
        file.delete();
    }
}

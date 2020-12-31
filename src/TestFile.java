import java.io.*;
import java.nio.charset.Charset;
import java.util.Optional;
import java.util.Scanner;

public class TestFile {

    public void givenUsingGuava_whenInterativeAFile() throws IOException {
        FileInputStream inputStream = null;
        Scanner scanner = null;

        try {
            inputStream = new FileInputStream("/home/alvaro/Downloads/person.sql");
            scanner = new Scanner(inputStream, "UTF-8");

            int totWords = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("Cleveland"))
                    System.out.println(line);
                totWords += line.length();
            }

            System.out.println("Tot words is " + totWords);
            if (scanner.ioException() != null) {
                throw scanner.ioException();
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (scanner != null)
                scanner.close();
        }
    }

    public String createFile(String path) throws IOException {
        File file = new File(path);
        boolean success = file.createNewFile();
        return path;
    }

    public boolean deleteFile(String path) throws IOException {
        File file = new File(path);
        boolean success = file.delete();
        return success;
    }

    public void writeFile(String message, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(message);
        printWriter.close();
    }

    public String readFile(String pathFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile, Charset.defaultCharset()));
        String msg = bufferedReader.readLine();
        bufferedReader.close();
        return msg;
    }

    public Optional<String> getExtensionFile(String pathFile){
        return Optional.ofNullable(pathFile)
                .filter(file -> file.contains("."))
                .map(f -> f.substring(f.lastIndexOf(".") + 1));
    }
}

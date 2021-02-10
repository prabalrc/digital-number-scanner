package digital.number.scanner.service;

import java.io.*;

public class FileParser {

    public static void main(String[] args) {

        try {
            File inputFileHandle = new File("src/test/resources/testInput/example");
            // Handle is valid file and file exists
            if (!inputFileHandle.exists() && !inputFileHandle.isFile()) {
                throw new FileNotFoundException("The input file is not found");
            }

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileHandle))) {
                Chunker.breakInput(bufferedReader);

            } catch (Exception ex) {

            } finally {

            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The application exited because: " + fileNotFoundException.getMessage());
        } catch (Exception ioException) {
            ioException.printStackTrace();
        }
    }
}

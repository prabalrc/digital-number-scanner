package digital.number.scanner.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class OutputWriter {

    public void write(String stringToWrite, String fileName) throws IOException {

        String outputFilePath = Paths.get("src", "test", "resources", "testOutput", fileName).toAbsolutePath().toString();
        try {
            if (!Files.exists(Paths.get(outputFilePath))) {
                Files.createFile(Paths.get(outputFilePath));
            }
            Files.write(Paths.get(outputFilePath), stringToWrite.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            ScannerService.printOnConsole(e.getMessage());
        }
    }

}

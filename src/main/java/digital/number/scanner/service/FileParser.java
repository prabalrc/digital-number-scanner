package digital.number.scanner.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileParser {

    /**
     *
     * @param inputFilePath
     */
    protected boolean parseFile(String inputFilePath) {
        boolean result = true;
        try {
            File inputFileHandle = new File(inputFilePath);

            // Is valid file and file exists
            if (!inputFileHandle.exists() && !inputFileHandle.isFile()) {
                throw new FileNotFoundException("The input file is not found");
            }

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileHandle))) {
                Chunker chunker = new Chunker();
                chunker.breakInput(bufferedReader, inputFileHandle.getName());

            } catch (Exception ex) {
                ScannerService.printOnConsole(ex.getMessage());
                result = false;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            ScannerService.printOnConsole("The application exited because: " + fileNotFoundException.getMessage());
            result = false;
        } catch (Exception exception) {
            ScannerService.printOnConsole("The application exited because: " + exception.getMessage());
            result = false;
        }
        return result;
    }
}

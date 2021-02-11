package digital.number.scanner.service;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ScannerServiceIntegrationTest {

    private static final String INPUT_DIR = "testInput";
    private static final String OUTPUT_DIR = "testOutput";
    private static final String INPUT_FILE_PATH = Paths.get("src", "test", "resources", INPUT_DIR, "example").toAbsolutePath().toString();
    private static final String OUTPUT_FILE_PATH = Paths.get("src", "test", "resources", OUTPUT_DIR, "example").toAbsolutePath().toString();

    protected List<String> performScanning(String inputFilePath) throws IOException {
        ScannerService scannerService = new ScannerService();
        scannerService.scanDigitalNumber(inputFilePath);
        return Files.readAllLines(Paths.get(OUTPUT_FILE_PATH));
    }

    @Test
    public void check_if_existing_input_file_is_handled() throws IOException {

        assertThat(performScanning(INPUT_FILE_PATH)).containsExactlyElementsOf(Files.readAllLines(Paths.get(OUTPUT_FILE_PATH)));
        Files.deleteIfExists(Paths.get(OUTPUT_FILE_PATH));
    }

}

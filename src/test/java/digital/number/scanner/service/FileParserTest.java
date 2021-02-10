package digital.number.scanner.service;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class FileParserTest {

    private static final String INPUT_DIR = "testInput";
    private static final String INPUT_FILE_PATH = Paths.get("src", "test", "resources", INPUT_DIR, "example1").toAbsolutePath().toString();

    FileParser fileParser;

    @Before
    public void setup() {
        fileParser = new FileParser();
    }

    @Test
    public void check_if_non_existent_file_is_handled() {
        assertThat(fileParser.parseFile(INPUT_FILE_PATH)).isFalse();
    }

    @Test
    public void check_if_existing_input_file_is_handled() throws IOException {

        Files.createFile(Paths.get(INPUT_FILE_PATH));
        assertThat(fileParser.parseFile(INPUT_FILE_PATH)).isTrue();
        Files.deleteIfExists(Paths.get(INPUT_FILE_PATH));
    }
}

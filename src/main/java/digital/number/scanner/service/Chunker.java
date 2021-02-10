package digital.number.scanner.service;

import java.io.BufferedReader;
import java.io.IOException;

public class Chunker {

    public static void breakInput(BufferedReader bufferedReader) throws IOException {

        String line;
        String[] lineArray = new String[3];
        // Read each line
        int lineCount = 0;

        while ((line = bufferedReader.readLine()) != null) {
            if (!line.isEmpty()) {
                lineArray[lineCount++] = line;
                if (lineCount == 3) {
                    Processor.process(lineArray);
                }
            } else {
                lineCount = 0;
                continue;
            }
        }

    }

}

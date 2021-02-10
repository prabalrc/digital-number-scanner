package digital.number.scanner.service;

import java.io.BufferedReader;
import java.io.IOException;

import static digital.number.scanner.service.ApplicationConstants.*;

public class Chunker {


    public void breakInput(BufferedReader bufferedReader, String fileName) throws IOException {

        Processor processor = new Processor();

        String eachLine;
        String[] lineArray = new String[LINE_COUNT];
        int lineCount = 0;

        // Read each line till EOF
        while ((eachLine = bufferedReader.readLine()) != null) {
            // UC4 : Handle any amount of whitespace characters in the delimiter line
            if (!eachLine.trim().isEmpty()) {
                eachLine = handleBadLineLengths(eachLine);
                lineArray[lineCount++] = eachLine;
                if (lineCount == LINE_COUNT) {
                    processor.processInput(lineArray, fileName);
                }
            } else {
                // Reset line count
                lineCount = 0;
                continue;
            }
        }

    }

    /**
     * UC3 : Handle incorrect lines lengths gracefully
     * @param eachLine each line of input
     * @return length-adjusted string padded with dots
     */
    private String handleBadLineLengths(String eachLine) {

        if (eachLine.length() < EXPECTED_LINE_LENGTH) {
            StringBuilder sb = new StringBuilder();
            sb.append(eachLine);
            for (int i = 0; i < EXPECTED_LINE_LENGTH - eachLine.length(); i++) {
                sb.append(DOT);
            }
            return sb.toString();
        }
        return eachLine;
    }

}

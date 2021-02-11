package digital.number.scanner.service;

import java.io.IOException;

import static digital.number.scanner.service.ApplicationConstants.*;

public class Processor {

    /**
     * Process the contents of the input file, read the symbols, match the symbols and write
     * the output to the output file
     *
     * @param stringArray lines in the form of array of strings
     * @param fileName name of the output file
     */
    public void processInput(String[] stringArray, String fileName) {

        SymbolReader symbolReader = new SymbolReader();
        SymbolMatcher symbolMatcher = new SymbolMatcher();
        OutputWriter outputWriter = new OutputWriter();

        ScannerService.printOnConsole("\nArray content\n");
        for (int lineIndex = 0; lineIndex < stringArray.length; lineIndex++) {
            ScannerService.printOnConsole("Line " + (lineIndex + 1) + " = " + stringArray[lineIndex]);
        }

        // Read symbols and form the matrix
        char[][][] characterMatrix = new char[MAX_DIGITS][ROWS][COLUMNS];
        int characterIndex = 0;
        for (int matrixNumber = 0; matrixNumber < MAX_DIGITS; matrixNumber++) {
            symbolReader.readSymbol(characterMatrix, stringArray, characterIndex, matrixNumber);
            characterIndex = characterIndex + COLUMNS;
        }

        // Match the symbols and write to output file
        try {
            outputWriter.write(symbolMatcher.matchSymbol(characterMatrix), fileName);
        } catch (IOException ioException) {
            ScannerService.printOnConsole("Error occurred while writing the output to the file: \n" + ioException.getMessage());
        }

    }



}

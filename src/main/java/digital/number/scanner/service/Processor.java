package digital.number.scanner.service;

import java.io.IOException;

import static digital.number.scanner.service.ApplicationConstants.*;

public class Processor {

    public void processInput(String[] stringArray, String fileName) {

        SymbolReader symbolReader = new SymbolReader();
        SymbolMatcher symbolMatcher = new SymbolMatcher();
        OutputWriter outputWriter = new OutputWriter();

        ScannerService.printOnConsole("\nArray content\n");
        for (int lineIndex = 0; lineIndex < stringArray.length; lineIndex++) {
            ScannerService.printOnConsole("Line " + (lineIndex + 1) + " = " + stringArray[lineIndex]);
        }

        char[][][] characterMatrix = new char[MAX_DIGITS][ROWS][COLUMNS];
        int characterIndex = 0;
        for (int matrixNumber = 0; matrixNumber < MAX_DIGITS; matrixNumber++) {
            symbolReader.readSymbol(characterMatrix, stringArray, characterIndex, matrixNumber);
            characterIndex = characterIndex + COLUMNS;
        }

        try {
            outputWriter.write(symbolMatcher.matchSymbol(characterMatrix), fileName);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }



}

package digital.number.scanner.service;

import static digital.number.scanner.service.ApplicationConstants.PRINT_ON_CONSOLE;

public class ScannerService {

    public static void main(String[] args) {

        scanDigitalNumber("src/test/resources/testInput/example");

    }

    public static void printOnConsole(String toPrint) {

        if (PRINT_ON_CONSOLE) {
            System.out.println(toPrint);
        }
    }

    protected static void scanDigitalNumber(String inputFilePath) {

        FileParser fileParser = new FileParser();
        fileParser.parseFile(inputFilePath);
    }
}

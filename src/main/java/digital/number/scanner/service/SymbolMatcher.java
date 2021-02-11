package digital.number.scanner.service;

import static digital.number.scanner.service.ApplicationConstants.*;

public class SymbolMatcher {

    /**
     * Find a matching symbol corresponding to the character matrix
     *
     * @param characterMatrix created matrix of all characters
     * @return the string representation of the number after matching the symbol
     */
    public String matchSymbol(char[][][] characterMatrix) {

        StringBuilder numberAsString = new StringBuilder();
        try {

            for (int matrixNumber = 0; matrixNumber < characterMatrix.length; matrixNumber++) {
                if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == DOT) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == DOT) && (characterMatrix[matrixNumber][1][1] == DOT) && (characterMatrix[matrixNumber][1][2] == DOT)
                        && (characterMatrix[matrixNumber][2][0] == DOT) && (characterMatrix[matrixNumber][2][1] == DOT) && (characterMatrix[matrixNumber][2][2] == DOT)) {
                    numberAsString.append("");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == UNDERSCORE) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == PIPE) && (characterMatrix[matrixNumber][1][1] == DOT) && (characterMatrix[matrixNumber][1][2] == PIPE)
                        && (characterMatrix[matrixNumber][2][0] == PIPE) && (characterMatrix[matrixNumber][2][1] == UNDERSCORE) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("0");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == DOT) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == DOT) && (characterMatrix[matrixNumber][1][1] == DOT) && (characterMatrix[matrixNumber][1][2] == PIPE)
                        && (characterMatrix[matrixNumber][2][0] == DOT) && (characterMatrix[matrixNumber][2][1] == DOT) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("1");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == UNDERSCORE) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == DOT) && (characterMatrix[matrixNumber][1][1] == UNDERSCORE) && (characterMatrix[matrixNumber][1][2] == PIPE)
                        && (characterMatrix[matrixNumber][2][0] == PIPE) && (characterMatrix[matrixNumber][2][1] == UNDERSCORE) && (characterMatrix[matrixNumber][2][2] == DOT)) {
                    numberAsString.append("2");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == UNDERSCORE) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == DOT) && (characterMatrix[matrixNumber][1][1] == UNDERSCORE) && (characterMatrix[matrixNumber][1][2] == PIPE)
                        && (characterMatrix[matrixNumber][2][0] == DOT) && (characterMatrix[matrixNumber][2][1] == UNDERSCORE) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("3");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == DOT) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == PIPE) && (characterMatrix[matrixNumber][1][1] == UNDERSCORE) && (characterMatrix[matrixNumber][1][2] == PIPE)
                        && (characterMatrix[matrixNumber][2][0] == DOT) && (characterMatrix[matrixNumber][2][1] == DOT) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("4");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == UNDERSCORE) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == PIPE) && (characterMatrix[matrixNumber][1][1] == UNDERSCORE) && (characterMatrix[matrixNumber][1][2] == DOT)
                        && (characterMatrix[matrixNumber][2][0] == DOT) && (characterMatrix[matrixNumber][2][1] == UNDERSCORE) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("5");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == UNDERSCORE) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == PIPE) && (characterMatrix[matrixNumber][1][1] == UNDERSCORE) && (characterMatrix[matrixNumber][1][2] == DOT)
                        && (characterMatrix[matrixNumber][2][0] == PIPE) && (characterMatrix[matrixNumber][2][1] == UNDERSCORE) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("6");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == UNDERSCORE) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == DOT) && (characterMatrix[matrixNumber][1][1] == DOT) && (characterMatrix[matrixNumber][1][2] == PIPE)
                        && (characterMatrix[matrixNumber][2][0] == DOT) && (characterMatrix[matrixNumber][2][1] == DOT) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("7");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == UNDERSCORE) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == PIPE) && (characterMatrix[matrixNumber][1][1] == UNDERSCORE) && (characterMatrix[matrixNumber][1][2] == PIPE)
                        && (characterMatrix[matrixNumber][2][0] == PIPE) && (characterMatrix[matrixNumber][2][1] == UNDERSCORE) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("8");
                } else if ((characterMatrix[matrixNumber][0][0] == DOT) && (characterMatrix[matrixNumber][0][1] == UNDERSCORE) && (characterMatrix[matrixNumber][0][2] == DOT)
                        && (characterMatrix[matrixNumber][1][0] == PIPE) && (characterMatrix[matrixNumber][1][1] == UNDERSCORE) && (characterMatrix[matrixNumber][1][2] == PIPE)
                        && (characterMatrix[matrixNumber][2][0] == DOT) && (characterMatrix[matrixNumber][2][1] == UNDERSCORE) && (characterMatrix[matrixNumber][2][2] == PIPE)) {
                    numberAsString.append("9");
                } else {
                    numberAsString.append(UNIDENTIFIED_CHARACTER);
                }
            }
            if (numberAsString.toString().contains(UNIDENTIFIED_CHARACTER)) {
                numberAsString.append(ILL_OUTPUT);
            }
            ScannerService.printOnConsole(numberAsString.toString());
            numberAsString.append(LINE_FEED);
        } catch (Exception exception) {
            numberAsString.append(ILL_OUTPUT);
            ScannerService.printOnConsole(numberAsString.toString());
        }

        return numberAsString.toString();
    }
}

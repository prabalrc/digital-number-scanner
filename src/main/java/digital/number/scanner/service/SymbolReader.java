package digital.number.scanner.service;

import static digital.number.scanner.service.ApplicationConstants.COLUMNS;
import static digital.number.scanner.service.ApplicationConstants.ROWS;

public class SymbolReader {

    /**
     * Read all the character and build the matrix of characters
     *
     * @param characterMatrix matrix to be created
     * @param stringArray array of strings formed by each line
     * @param characterIndex the index from which to start reading
     * @param matrixNumber
     */
    public void readSymbol(char[][][] characterMatrix, String[] stringArray, int characterIndex, int matrixNumber) {

        for (int rowNumber = 0; rowNumber < ROWS; rowNumber++) {
            char[] temporarySlice = getArraySlice(stringArray[rowNumber].toCharArray(), characterIndex, characterIndex + 3);
            for (int columnNumber = 0; columnNumber < COLUMNS; columnNumber++) {
                characterMatrix[matrixNumber][rowNumber][columnNumber] = temporarySlice[columnNumber];
            }
        }
    }

    /**
     * Given an array of characters, return a slice of the array based
     * on the beginIndex and endIndex
     *
     * @param charArray  array of characters
     * @param beginIndex index from where the slice is desired
     * @param endIndex   index up to which the slice is desired
     * @return the sliced array
     */
    private char[] getArraySlice(char[] charArray, int beginIndex, int endIndex) {

        char[] arraySlice = new char[endIndex - beginIndex];
        for (int sliceIndex = 0; sliceIndex < arraySlice.length; sliceIndex++) {
            arraySlice[sliceIndex] = charArray[beginIndex + sliceIndex];
        }
        return arraySlice;
    }
}

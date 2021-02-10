package digital.number.scanner.service;

public class Processor {

    static void process(String[] stringArray) {
        System.out.println("\nArray content\n");
        int lineLength = stringArray.length;

        for(int lineIdx=0; lineIdx < lineLength; lineIdx++) {
            System.out.println("Line " + (lineIdx+1) + " = " + stringArray[lineIdx]);
        }

        char[][][] ca = new char[9][3][3];
        int charIdx = 0;
        for(int k=0; k<9; k++) {
            for (int j=0; j<3; j++) {
                for (int i=0; i<3; i++) {
                    ca[k][j][i] = getArraySlice(stringArray[j].toCharArray(), charIdx, charIdx + 3)[i];
                }
            }
            charIdx = charIdx + 3;
        }
        SymbolReader.readSymbol(ca);

    }

    public static char[] getArraySlice(char[] arr, int start, int end) {

        char[] slice = new char[end-start];
        // Copy elements of arr to slice
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }

        // return the slice
        return slice;
    }
}

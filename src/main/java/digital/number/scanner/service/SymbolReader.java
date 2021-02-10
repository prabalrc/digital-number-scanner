package digital.number.scanner.service;

import java.util.Map;

public class SymbolReader {


    private static final char DOT = '.';
    private static final char PIPE = '|';
    private static final char UNDERSCORE = '_';

    public static void readSymbol(char[][][] charArray) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == DOT) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == DOT) && (charArray[i][1][1] == DOT) && (charArray[i][1][2] == DOT)
                    && (charArray[i][2][0] == DOT) && (charArray[i][2][1] == DOT) && (charArray[i][2][2] == DOT)) {
                sb.append("");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == DOT) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == DOT) && (charArray[i][1][1] == DOT) && (charArray[i][1][2] == PIPE)
                    && (charArray[i][2][0] == DOT) && (charArray[i][2][1] == DOT) && (charArray[i][2][2] == PIPE)) {
                sb.append("1");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == UNDERSCORE) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == DOT) && (charArray[i][1][1] == UNDERSCORE) && (charArray[i][1][2] == PIPE)
                    && (charArray[i][2][0] == PIPE) && (charArray[i][2][1] == UNDERSCORE) && (charArray[i][2][2] == DOT)) {
                sb.append("2");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == UNDERSCORE) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == DOT) && (charArray[i][1][1] == UNDERSCORE) && (charArray[i][1][2] == PIPE)
                    && (charArray[i][2][0] == DOT) && (charArray[i][2][1] == UNDERSCORE) && (charArray[i][2][2] == PIPE)) {
                sb.append("3");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == DOT) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == PIPE) && (charArray[i][1][1] == UNDERSCORE) && (charArray[i][1][2] == PIPE)
                    && (charArray[i][2][0] == DOT) && (charArray[i][2][1] == DOT) && (charArray[i][2][2] == PIPE)) {
                sb.append("4");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == UNDERSCORE) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == PIPE) && (charArray[i][1][1] == UNDERSCORE) && (charArray[i][1][2] == DOT)
                    && (charArray[i][2][0] == DOT) && (charArray[i][2][1] == UNDERSCORE) && (charArray[i][2][2] == PIPE)) {
                sb.append("5");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == UNDERSCORE) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == PIPE) && (charArray[i][1][1] == UNDERSCORE) && (charArray[i][1][2] == DOT)
                    && (charArray[i][2][0] == PIPE) && (charArray[i][2][1] == UNDERSCORE) && (charArray[i][2][2] == PIPE)) {
                sb.append("6");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == UNDERSCORE) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == DOT) && (charArray[i][1][1] == DOT) && (charArray[i][1][2] == PIPE)
                    && (charArray[i][2][0] == DOT) && (charArray[i][2][1] == DOT) && (charArray[i][2][2] == PIPE)) {
                sb.append("7");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == UNDERSCORE) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == PIPE) && (charArray[i][1][1] == UNDERSCORE) && (charArray[i][1][2] == PIPE)
                    && (charArray[i][2][0] == PIPE) && (charArray[i][2][1] == UNDERSCORE) && (charArray[i][2][2] == PIPE)) {
                sb.append("8");
            } else if ((charArray[i][0][0] == DOT) && (charArray[i][0][1] == UNDERSCORE) && (charArray[i][0][2] == DOT)
                    && (charArray[i][1][0] == PIPE) && (charArray[i][1][1] == UNDERSCORE) && (charArray[i][1][2] == PIPE)
                    && (charArray[i][2][0] == DOT) && (charArray[i][2][1] == UNDERSCORE) && (charArray[i][2][2] == PIPE)) {
                sb.append("9");
            } else {
                sb.append("?");
            }
        }
        if (sb.toString().contains("?")) sb.append("ILL");
        System.out.println(sb.toString());

    }
}

package digital.number.scanner.service;

public class ApplicationConstants {

    private ApplicationConstants() {
        throw new IllegalStateException("Constant class");
    }

    public static final int LINE_COUNT = 3;
    public static final int EXPECTED_LINE_LENGTH = 27;
    public static final char DOT = '.';
    public static final char PIPE = '|';
    public static final char UNDERSCORE = '_';
    public static final int MAX_DIGITS = 9;
    public static final int ROWS = 3;
    public static final int COLUMNS = 3;
    public static final String UNIDENTIFIED_CHARACTER = "?";
    public static final String ILL_OUTPUT = "ILL";
    public static final String LINE_FEED = "\n";
    public static final boolean PRINT_ON_CONSOLE = false; // turn to true if console outputs are required
}

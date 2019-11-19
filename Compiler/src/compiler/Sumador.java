package compiler;

public class Sumador {

    static boolean nextChange = false;
    final static int finalChar = 71;

    public static String nextVal(String value) {
        String temp = "";
        nextChange = false;
        for (int i = value.length() - 1; i >= 0; i--) {
            if (i == value.length() - 1) {
                temp += calculatedValue(value.charAt(i));
            } else if (nextChange) {
                nextChange = false;
                char charTemp = calculatedValue(value.charAt(i));
                temp = charTemp + temp;
                if (i == 0) {
                    nextChange = nextChange && value.charAt(i) + 1 == finalChar;
                }
            } else {
                temp = value.charAt(i) + temp;
            }
        }
        if (nextChange) {
            temp = "0" + temp;
        }
        return temp;
    }

    private static char calculatedValue(char charValue) {
        switch (charValue + 1) {
            case 58:
                return 65; // A
            case finalChar:
                nextChange = true;
                return 48; // 0
            default:
                return (char) (charValue + 1);
        }
    }

    /*
    static boolean nextChange = false;

    public static String nextVal(String value) {
        String temp = "";
        nextChange = false;
        for (int i = value.length() - 1; i >= 0; i--) {
            if (i == value.length() - 1) {
                temp += calculatedValue(value.charAt(i));
            } else if (nextChange) {
                char charTemp = calculatedValue(value.charAt(i));
                temp = charTemp + temp;
                nextChange = nextChange && value.charAt(i) + 1 == 91 && i == 0;
            } else {
                temp = value.charAt(i) + temp;
            }
        }
        if (nextChange) {
            temp = "0" + temp;
        }
        return temp;
    }

    private static char calculatedValue(char charValue) {
        switch (charValue + 1) {
            case 58:
                return 65; // A
            case 91:
                nextChange = true;
                return 48; // 0
            default:
                return (char) (charValue + 1);
        }
    }
     */
}

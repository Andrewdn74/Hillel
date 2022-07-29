package Andrii.Vakulenko.lesson3;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String originalString = new String("WE NEED SOME NEW");
        String partStr1 = originalString.substring(0, 2);
        String partStr2 = originalString.substring(2, 7);
        String partStr3 = originalString.substring(7, 12);
        String partStr4 = originalString.substring(12);
        System.out.println((partStr3 + partStr4 + " " + partStr1 + partStr2).toLowerCase());
        System.out.println((partStr3 + partStr4).toLowerCase() + " " + partStr1 + partStr2);
        System.out.println((partStr3).toLowerCase() + " string " + partStr1.toLowerCase() + " got");
    }
}


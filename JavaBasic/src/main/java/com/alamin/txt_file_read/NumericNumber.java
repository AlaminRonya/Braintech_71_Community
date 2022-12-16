package com.alamin.txt_file_read;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumericNumber {
    private static Pattern pattern = Pattern.compile("[0-9]{5,15}");

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(strNum);
        return matcher.matches();
    }
}

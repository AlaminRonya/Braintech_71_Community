package com.alamin.txt_file_read;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidImpl {
    private static Pattern pt = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean isValid(String value) {
        String trim = value.trim();
        if (trim.isEmpty()) {
            return false;
        }
        Matcher mt = pt.matcher(value);
        return mt.matches();
    }
}
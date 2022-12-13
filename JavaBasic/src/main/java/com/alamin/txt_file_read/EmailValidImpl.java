package com.alamin.txt_file_read;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidImpl {
    private static final Pattern EMAIL = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean isValid(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        Matcher mt = EMAIL.matcher(value);
        return mt.matches();
    }
}
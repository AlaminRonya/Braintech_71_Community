package com.alamin.txt_file_read;

import java.util.regex.Pattern;

public class NumberValidImpl {
    private static final Pattern USA_PHONE_NUMBER =
            Pattern.compile("^[+]?[0-9]?[-. ]?\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$", Pattern.CASE_INSENSITIVE);

    public static boolean isValid(String value) {

        return value != null && !value.isEmpty() &&
                USA_PHONE_NUMBER.matcher(value).matches();
    }
}
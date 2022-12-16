package com.alamin.txt_file_read;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//https://mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
public class IpAddressValidImpl {
    private static final Pattern IPv4 = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern IP = Pattern.compile("^(([0-9]|[1-9][0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
            "([0-9]|[1-9][0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.)[0-9a-zA-z\\.]*", Pattern.CASE_INSENSITIVE);

    private static final Pattern IP1 = Pattern.compile("^(([0-9]|[0-9][0-9]|[0-9][0-9][0-9])\\." +
            "([0-9]|[0-9][0-9]|[0-9][0-9][0-9])\\.)[0-9a-zA-z.]*", Pattern.CASE_INSENSITIVE);

    public static boolean isValid(String value) {
        if (value== null || value.isEmpty()) {
            return false;
        }
        Matcher mt1 = IP1.matcher(value);
        return mt1.matches();
    }
}

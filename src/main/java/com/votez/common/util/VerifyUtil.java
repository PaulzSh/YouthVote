package com.votez.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUtil {
    private static String emailPattern = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    private static String mobilePattern = "^(13[0-9]|14[5|7]|15[0|1|2|3|4|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
    private static String zipCodePattern = "^[0-9]{5}(?:-[0-9]{4})?$";

    public static boolean verifyEmail(String email){
        Pattern p1 = Pattern.compile(emailPattern);
        Matcher m1 = p1.matcher(email);
        return m1.matches();
    }

    public static boolean verifyMobile(String mobile){
        Pattern p1 = Pattern.compile(mobilePattern);
        Matcher m1 = p1.matcher(mobile);
        return m1.matches();
    }

    public static boolean verifyZipCode(String zipCode){
        Pattern p1 = Pattern.compile(zipCodePattern);
        Matcher m1 = p1.matcher(zipCode);
        return m1.matches();
    }
}

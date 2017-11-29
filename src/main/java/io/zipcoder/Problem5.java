package io.zipcoder;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;


public class Problem5 {

    public String reverseString(String str) {

        if (str.length() == 0) {
            return "";
        }

        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    public boolean allCaps(String str) {
        while (str.length() > 0) {
            if (Character.isLowerCase(str.charAt(0))) {
                return false;
            }
            str = str.substring(1);
        }
        return true;
    }

    public String makeAllLowerCase(String str) {
        if (str.length() == 0) {
            return "";
        }
        return Character.toLowerCase(str.charAt(0)) + makeAllLowerCase(str.substring(1));
    }

    public String makeFirstLetterUpperCase(String str) {
        if (allCaps(str)) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + makeAllLowerCase(str.substring(1));
    }

    public String checkString(String str) {
        if (allCaps(str)) {
            return str;
        }
        return makeFirstLetterUpperCase(str);
    }

    public char[] checkWords(String[] arr) {
        arr[0] = checkString(arr[0]);
        if (arr.length == 1) {
            return arr[0].toCharArray();
        }
        arr[0] += " ";
        return ArrayUtils.addAll(arr[0].toCharArray(), checkWords(Arrays.copyOfRange(arr, 1, arr.length)));
    }

    public String makeString(char[] arr) {
        if (arr.length == 0) {
            return "";
        }
        return Character.toString(arr[0]) + makeString(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public String reverse(String str) {
        return makeString(checkWords(reverseString(str).split(" ")));
    }

}

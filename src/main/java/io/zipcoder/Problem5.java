package io.zipcoder;

import java.util.ArrayList;

public class Problem5 {


    public static void main(String[] args) {
        String input = "I love UNIT Testing";

        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb = sb.reverse();

        for (int i = 0; i < sb.length(); i++)
            System.out.println(sb.charAt(i));

    }


    public static String reverse(String stringLove) {
    return
    }
}


//    public static String capitalize(String sL) {
//
//        StringBuilder sb = new StringBuilder();
//        String result = "";
//
//        char currentChar;
//
//        for (int i = 0; i < stringLove.length(); i++) {
//
//             currentChar = stringLove.charAt(i);
//
//            if (i == 0) {
//                result = result + Character.toUpperCase(currentChar);
//            }
//        }
//return result;
////        }
////        return result.substring(0, result.length() - 1);
//
//    }
//}


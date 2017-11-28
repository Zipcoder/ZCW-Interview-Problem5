package io.zipcoder;

public class Problem5 {

    public static void main(String[] args) {
        String stringLove = "I love UNIT Testing";
        System.out.println(reverse(stringLove));
    }

        //Output: "GnitseT TINU Evol I"


    public static String reverse(String input) {
        char[] stringChar = input.toCharArray();
        int begin = 0;
        int end = stringChar.length - 1;
        char x;
        while (end > begin) {
            x = stringChar[begin];
            stringChar[begin] = stringChar[end];
            stringChar[end] = x;
            end--;
            begin++;
        }
        return new String(stringChar);
    }
}

//        StringBuilder sb = new StringBuilder();
//        sb.append(input);
//        sb = sb.reverse();
//
//        for (int i = 0; i < sb.length(); i++)
//            System.out.println(sb.charAt(i));
//
//    }
//}


package io.zipcoder;

public class Problem5 {

    public String reverse(String starter) {

        StringBuilder sb = new StringBuilder();
        for (int i = starter.length() - 1; i > 0; i--){
            if (starter.charAt(i - 1) == ' ')
                sb.append((char) ((int) starter.charAt(i) - 32));
            else sb.append(starter.charAt(i));
        }

        sb.append(starter.charAt(0));

        
        return sb.toString();
    }
}

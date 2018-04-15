package io.zipcoder;

public class Problem5 {

    public String reverseAndCapitalize(String input){
        return capitalizeFirstCharacter(reverseString(input));
    }

    public String reverseString(String input) {
        if(input.isEmpty())
            return input;
        return reverseString(input.substring(1)) + input.charAt(0);

    }
        public String capitalizeFirstCharacter (String input){
            input = Character.toUpperCase(input.charAt(0)) + input.substring(1);
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    input = input.substring(0, i + 1) + Character.toUpperCase(input.charAt(i + 1)) +
                            input.substring(i + 2);
                }
            }
            return input;
        }
}

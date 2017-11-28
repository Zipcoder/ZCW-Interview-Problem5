package io.zipcoder;

public class Problem5 {

    public String reverseAndCapitalize(String input) {
        String[] splitInput = input.split("");
        StringBuilder output = new StringBuilder();

        int outputSetter = input.length() - 1;



        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(outputSetter);

            if(i == 0) {
                output.append(Character.toUpperCase(ch));
            }
            if(outputSetter >= 1) {
                if(input.charAt(outputSetter - 1) == ' ') {
                    ch = Character.toUpperCase(ch);
                    output.append(ch);
                }
//                else if(input.charAt(outputSetter + 1) == ' ') {
//                    ch = Character.toLowerCase(ch);
//                    output.append(ch);
//                }
                else {
                    output.append(ch);
                }
                outputSetter--;
            }
            else {
                ch = input.charAt(0);
                output.append(ch);
            }

//            while(outputSetter > 0) {
//
//            }

        }

        return output.toString();

    }

}

package io.zipcoder;

public class Problem5 {

    public String reverseStringWithCharacterArray(String input) {
        char[] characterArray = input.toCharArray();
        input = "";
        for (int i = characterArray.length - 1; i >= 0; i--) {
            input = input + characterArray[i];
        }
        return input;
    }

    public String reverseStringWithVariable(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        return reverse;
    }

    public String reverseStringNoNewVariables(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            input += input.substring(i, i + 1);
        }
        input = input.substring(input.length()/2);
        return input;
    }



    public String capitalizeFirstLetterOfEveryWord(String input) {
        input = reverseStringNoNewVariables(input);

        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                input = input.substring(i, i +1).toUpperCase() + input.substring(i + 1);
                //The below also works.
                //input = Character.toString(input.charAt(i)).toUpperCase() + input.substring(i + 1);
            }
            else if (input.substring(i, i + 1).equals(" ")) {
                input = input.substring(0, i + 1) + input.substring(i + 1, i + 2).toUpperCase() + input.substring(i + 2);
            }
        }
        return input;
    }
}

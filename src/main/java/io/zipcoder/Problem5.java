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

    public String capitalizeFirstLetterOfEveryWord(String input) {
        String capitalizedFirstLetterOFEveryWord = "";

        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                capitalizedFirstLetterOFEveryWord = input.substring(i, i + 1).toUpperCase();
            }
            else if (input.substring(i, i + 1).equals(" ")) {
                System.out.println("Character is a space");
                capitalizedFirstLetterOFEveryWord += input.substring(i + 1, i + 2).toUpperCase();
            }
            else {
                capitalizedFirstLetterOFEveryWord += input.substring(i, i + 1);
            }
            System.out.println("Character is " + input.charAt(i));
        }
        return capitalizedFirstLetterOFEveryWord;
    }
}

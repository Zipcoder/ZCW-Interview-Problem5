package io.zipcoder;

public class Problem5 {

    public String reverseString(String input) {
        return indexCharToBeginning(input, 0);
    }

    private String indexCharToBeginning(String input, int index) {
        if(index == input.length()) {
            return input;
        }
        else {
            if(index == input.length() - 1 || input.substring(index + 1, index + 2).equals(" ")) {
                input = input.substring(index, index + 1).toUpperCase() + input.substring(0, index) + input.substring(index + 1);
            }
            else {
                input = input.substring(index, index + 1) + input.substring(0, index) + input.substring(index + 1);
            }
            index++;
            return indexCharToBeginning(input, index);
        }
    }
}

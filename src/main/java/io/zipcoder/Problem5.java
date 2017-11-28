package io.zipcoder;

public class Problem5 {
    public static void main(String[] args){
        String result = stringReverse("merin lia jose");
        System.out.println(result);
    }
    public static String stringReverse(String str){
        Character[] charArray = new Character[str.length()];
        String outPut = "";
        for(int i=str.length()-1,k=0;i>=0;i--,k++){
            charArray[k] = str.charAt(i);
        }
        for (int j=0;j<charArray.length;j++){
            for (int k=j+1;k<charArray.length;k++){
                if(charArray[j] == ' '){
                    charArray[k] == charArray[k].toString().toUpperCase();
                    outPut +=charArray[j];
                }
                else {
                    outPut += charArray[j];
                }

            }

        }
        return outPut;
    }
}

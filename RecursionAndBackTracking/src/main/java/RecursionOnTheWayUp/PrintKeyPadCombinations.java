package RecursionOnTheWayUp;

import InputUtilites.InputUtils;

public class PrintKeyPadCombinations {
    public static void main(String[] args) {
        String str = InputUtils.string();

        printKeyPadCombinations(str, "");
    }

    private static void printKeyPadCombinations(String str, String answerSoFar) {
        if(str.isBlank()){
            System.out.println(answerSoFar);
            return;
        }

        int digit = Integer.parseInt(String.valueOf(str.charAt(0)));
        String keys = lettersArray[digit];

        for(int i = 0; i < keys.length(); i++){
            printKeyPadCombinations(str.substring(1), answerSoFar + keys.charAt(i));
        }
    }

    static String[] lettersArray = {",:", "<;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

}

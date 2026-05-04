package RecursionOnTheWayUp;

import InputUtilites.InputUtils;

public class PrintAllSubSequences {

    public static void main(String[] args) {
        String str = InputUtils.string();

        printAllSubsequences(str, "");
    }

    private static void printAllSubsequences(String str, String answerSoFar) {
        if(str.isBlank()){
            System.out.println(answerSoFar);
            return;
        }
        printAllSubsequences(str.substring(1), answerSoFar);

        printAllSubsequences(str.substring(1), answerSoFar + str.charAt(0));
    }
}

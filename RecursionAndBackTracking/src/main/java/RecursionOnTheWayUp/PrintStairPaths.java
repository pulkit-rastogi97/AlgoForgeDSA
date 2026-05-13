package RecursionOnTheWayUp;

import InputUtilites.InputUtils;

public class PrintStairPaths {
    public static void main(String[] args) {
        Integer n = InputUtils.integer();

        printStairPaths(n, "");
    }

    private static void printStairPaths(Integer n, String answerSoFar) {
        if(n == 0){
            System.out.println(answerSoFar);
        }

        if(n < 0){
            return;
        }

        //1-step
        printStairPaths(n - 1, answerSoFar + 1);

        //2-step
        printStairPaths(n - 2, answerSoFar + 2);

        //3-step
        printStairPaths(n - 3, answerSoFar + 3);
    }
}

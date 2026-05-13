package RecursionOnTheWayUp;

import InputUtilites.InputUtils;

public class PrintMazePaths {
    public static void main(String[] args) {
        Integer srcRow = InputUtils.integer();
        Integer srcCol = InputUtils.integer();
        Integer destRow = InputUtils.integer();
        Integer destCol = InputUtils.integer();

        printMazePaths(srcRow, srcCol, destRow, destCol, "");
    }

    private static void printMazePaths(Integer srcRow, Integer srcCol, Integer destRow, Integer destCol, String answerSoFar) {
        if(srcRow == destRow && srcCol == destCol){
            System.out.println(answerSoFar);
            return;
        } else if (srcRow > destRow || srcCol > destCol) {
            return;
        }

        //horizontal-step
        printMazePaths(srcRow, srcCol + 1, destRow, destCol, answerSoFar + "h");

        //vertical-step
        printMazePaths(srcRow + 1, srcCol, destRow, destCol, answerSoFar + "v");
    }
}

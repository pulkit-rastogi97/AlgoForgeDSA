package RecursionOnTheWayUp;

import InputUtilites.InputUtils;

public class PrintMazePathsWithInfiniteJumps {
    public static void main(String[] args) {
        Integer srcRow = InputUtils.integer();
        Integer srcCol = InputUtils.integer();
        Integer destRow = InputUtils.integer();
        Integer destCol = InputUtils.integer();

        printMazePathsWithInfiniteJumps(srcRow, srcCol, destRow, destCol, "");
    }

    private static void printMazePathsWithInfiniteJumps(Integer srcRow, Integer srcCol, Integer destRow, Integer destCol, String answerSoFar) {
        if(srcRow == destRow && srcCol == destCol){
            System.out.println(answerSoFar);
            return;
        }else if(srcRow > destRow || srcCol > destCol){
            return;
        }

        for(int jump = 1; jump <= destCol - srcCol; jump++){
            printMazePathsWithInfiniteJumps(srcRow, srcCol + jump, destRow, destCol, answerSoFar + "h" + jump);
        }

        for(int jump = 1; jump <= destRow - srcRow; jump++){
            printMazePathsWithInfiniteJumps(srcRow + jump, srcCol, destRow, destCol, answerSoFar + "v" + jump);
        }

    }

}

package RecursionOnTheWayDown;

import InputUtilites.InputUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GetMazePathsWithInfiniteJumps {

    public static void main(String[] args) {
        Integer srcRow = InputUtils.integer();
        Integer srcCol = InputUtils.integer();
        Integer destRow = InputUtils.integer();
        Integer destCol = InputUtils.integer();

        ArrayList<String> allMazePaths = getMazePathsWithInfiniteJumps
                (srcRow, srcCol, destRow, destCol);
        System.out.println(allMazePaths);
    }

    private static ArrayList<String> getMazePathsWithInfiniteJumps(Integer srcRow, Integer srcCol, Integer destRow, Integer destCol) {
        if(Objects.equals(srcRow, destRow) && Objects.equals(srcCol, destCol)){
            return new ArrayList<>(List.of(""));
        }else if(srcRow > destRow || srcCol > destCol){
            return new ArrayList<>();
        }

        ArrayList<String> allMazePaths = new ArrayList<>();

        for(int i = 1; i <= destCol - srcCol; i++) {
            ArrayList<String> fromHorizontal = getMazePathsWithInfiniteJumps(srcRow, srcCol + i, destRow, destCol);

            final int finalI = i;
            allMazePaths.addAll(
                    fromHorizontal.stream()
                            .map(s -> "h" + finalI + s)
                            .collect(Collectors.toList())
            );
        }


        for(int i = 1; i <= destRow - srcRow; i++) {

            ArrayList<String> fromVertical = getMazePathsWithInfiniteJumps(srcRow + i, srcCol, destRow, destCol);

            final int finalI = i;

            allMazePaths.addAll(
                    fromVertical.stream()
                            .map(s -> "v" + finalI + s)
                            .collect(Collectors.toList())
            );
        }

        return allMazePaths;
    }

}

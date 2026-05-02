package RecursionOnTheWayDown;

import InputUtilites.InputUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GetMazePaths {
    public static void main(String[] args) {
        Integer srcRow = InputUtils.integer();
        Integer srcCol = InputUtils.integer();
        Integer destRow = InputUtils.integer();
        Integer destCol = InputUtils.integer();

        ArrayList<String> allMazePaths = getMazePaths(srcRow, srcCol, destRow, destCol);
        System.out.println(allMazePaths);
    }

    private static ArrayList<String> getMazePaths(Integer srcRow, Integer srcCol, Integer destRow, Integer destCol) {
        if(Objects.equals(srcRow, destRow) && Objects.equals(srcCol, destCol)){
            return new ArrayList<>(List.of(""));
        }else if(srcRow > destRow || srcCol > destCol){
            return new ArrayList<>();
        }

        ArrayList<String> fromHorizontal = getMazePaths(srcRow, srcCol + 1, destRow, destCol);
        ArrayList<String> fromVertical = getMazePaths(srcRow + 1, srcCol, destRow, destCol);

        ArrayList<String> allMazePaths = new ArrayList<>();

        allMazePaths.addAll(
                fromHorizontal.stream()
                .map(s -> "h".concat(s))
                .collect(Collectors.toList())
        );

        allMazePaths.addAll(
                fromVertical.stream()
                        .map(s -> "v".concat(s))
                        .collect(Collectors.toList())
        );

        return allMazePaths;
    }
}

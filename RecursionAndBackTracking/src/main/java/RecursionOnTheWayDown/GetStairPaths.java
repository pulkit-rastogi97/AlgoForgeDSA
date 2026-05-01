package RecursionOnTheWayDown;

import InputUtilites.InputUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetStairPaths {
    public static void main(String[] args) {
        Integer n = InputUtils.integer();

        ArrayList<String> allStairPaths = getStairPaths(n);
        System.out.println(allStairPaths);
    }

    private static ArrayList<String> getStairPaths(Integer n) {
        if(n == 0){
            return new ArrayList<>(List.of(""));
        }

        if(n < 0){
            return new ArrayList<>();
        }

        ArrayList<String> allStairPaths = new ArrayList<>();
        ArrayList<String> n1 = getStairPaths(n - 1);
        ArrayList<String> n2 = getStairPaths(n - 2);
        ArrayList<String> n3 = getStairPaths(n - 3);

        for(String x: n1){
            allStairPaths.add("1" + x);
        }

        for(String x: n2){
            allStairPaths.add("2" + x);
        }

        for(String x: n3){
            allStairPaths.add("3" + x);
        }

        return allStairPaths;
    }
}

package RecursionOnTheWayDown;

import InputUtilites.InputUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetKeyPadCombinations {
    public static void main(String[] args) {
        String str = InputUtils.string();

//        ArrayList<String> keyPadCombinations = getKeyPadCombinations(str);
        ArrayList<String> keyPadCombinations = getKeyPadCombinationsV2(str);
        System.out.println(keyPadCombinations);
    }

    private static ArrayList<String> getKeyPadCombinations(String str) {
        if(str.length() == 1){
            String[] keys = getKeys(str.charAt(0));
            ArrayList<String> baseResult = new ArrayList<>();
            for(String x : keys){
                baseResult.add(x);
            }
            return baseResult;
        }

        ArrayList<String> combos = getKeyPadCombinations(str.substring(1));

        ArrayList<String> allKeyPadCombos = new ArrayList<>();
        String[] keys = getKeys(str.charAt(0));

        for(String x : combos){
            for(String y : keys){
                allKeyPadCombos.add(y.concat(x));
            }
        }

        return allKeyPadCombos;

    }

    private static ArrayList<String> getKeyPadCombinationsV2(String str) {
        if(str.length() == 1){
            String keys = lettersArray[Integer.parseInt(String.valueOf(str.charAt(0)))];
            ArrayList<String> baseResult = new ArrayList<>();
            for(int i = 0; i < keys.length(); i++){
                baseResult.add(String.valueOf(keys.charAt(i)));
            }
            return baseResult;
        }

        ArrayList<String> combos = getKeyPadCombinationsV2(str.substring(1));

        ArrayList<String> allKeyPadCombos = new ArrayList<>();
        String keys = lettersArray[Integer.parseInt(String.valueOf(str.charAt(0)))];

        for(int i = 0; i < keys.length(); i++){
            for(String x : combos){
                allKeyPadCombos.add(String.valueOf(keys.charAt(i)).concat(x));
            }
        }

        return allKeyPadCombos;

    }

    private static String[] getKeys(char c) {
        return switch (c) {
            case '0' -> new String[] {" ", ".", ";"};
            case '1' -> new String[] {"<", ",", ">"};
            case '2' -> new String[] {"a", "b", "c"};
            case '3' -> new String[] {"d", "e", "f"};
            case '4' -> new String[] {"g", "h", "i"};
            case '5' -> new String[] {"j", "k", "l"};
            case '6' -> new String[] {"m", "n", "o"};
            case '7' -> new String[] {"p", "q", "r", "s"};
            case '8' -> new String[] {"t", "u", "v"};
            case '9' -> new String[] {"w", "x", "y", "z"};
            default -> new String[]{};
        };
    }

    static String[] lettersArray = {",:", "<;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


}

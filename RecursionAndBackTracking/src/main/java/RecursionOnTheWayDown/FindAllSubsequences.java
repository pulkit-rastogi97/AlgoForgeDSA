package RecursionOnTheWayDown;

import InputUtilites.InputUtils;

import java.util.ArrayList;

public class FindAllSubsequences {
    public static void main(String[] args) {
        String str = InputUtils.string();

        ArrayList<String> allSubsequences = getAllSubSequences(str);
        System.out.println(allSubsequences);
    }

    private static ArrayList<String> getAllSubSequences(String str) {
        if(str.isEmpty()){
            ArrayList<String> arrList = new ArrayList<>();
            arrList.add(str);
            return arrList;
        }

        ArrayList<String> subSequences = getAllSubSequences(str.substring(1));

        int size = subSequences.size();
        for(int i = 0; i < size; i++){
            String s = subSequences.get(i);
            subSequences.add(str.substring(0,1).concat(s));
        }

        return subSequences;
    }
}

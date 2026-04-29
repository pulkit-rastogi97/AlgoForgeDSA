package RecursionOnArrays;

import InputUtilites.InputUtils;

public class FindLastIndexOfArray {

    public static void main(String[] args) {
        Integer size = InputUtils.inputInteger();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = InputUtils.inputInteger();
        }

        Integer target = InputUtils.inputInteger();

        int max = findLastIndex(arr, 0, target);
        System.out.println(max);
    }

    private static int findLastIndex(int[] arr, int idx, Integer target) {
        if(idx == arr.length){
            return -1;
        }

        int furtherLastIndex = findLastIndex(arr, idx + 1, target);

        if(furtherLastIndex == -1 && arr[idx] == target){
            return idx;
        }else{
            return furtherLastIndex;
        }

    }
}

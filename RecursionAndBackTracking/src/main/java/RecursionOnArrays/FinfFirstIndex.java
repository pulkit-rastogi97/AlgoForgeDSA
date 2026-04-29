package RecursionOnArrays;

import InputUtilites.InputUtils;

public class FinfFirstIndex {

    public static void main(String[] args) {
        Integer size = InputUtils.integer();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = InputUtils.integer();
        }

        Integer target = InputUtils.integer();

        int firstIndex = findFirstIndex(arr, 0, target);
        System.out.println(firstIndex);
    }

    private static int findFirstIndex(int[] arr, int idx, Integer target) {
        if(idx == arr.length){
            return -1;
        }

        int furtherFirstIndex = findFirstIndex(arr, idx + 1, target);

        if(arr[idx] == target){
            return idx;
        }else{
            return furtherFirstIndex;
        }
    }

}

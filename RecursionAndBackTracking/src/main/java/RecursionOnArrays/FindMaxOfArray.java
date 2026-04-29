package RecursionOnArrays;

import InputUtilites.InputUtils;

public class FindMaxOfArray {

    public static void main(String[] args) {
        Integer size = InputUtils.integer();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = InputUtils.integer();
        }

        int max = findMax(arr, 0);
        System.out.println(max);
    }

    private static int findMax(int[] arr, int idx) {
        if(idx == arr.length){
            return arr[0];
        }

        int max = findMax(arr, idx + 1);
        return arr[idx] > max ? arr[idx] : max;

    }
}

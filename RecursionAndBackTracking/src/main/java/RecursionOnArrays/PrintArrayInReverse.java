package RecursionOnArrays;

import InputUtilites.InputUtils;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        Integer size = InputUtils.inputInteger();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = InputUtils.inputInteger();
        }

        printArrayInReverse(arr, 0);
    }

    private static void printArrayInReverse(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }

        printArrayInReverse(arr, idx + 1);

        System.out.println(arr[idx]);

    }
}

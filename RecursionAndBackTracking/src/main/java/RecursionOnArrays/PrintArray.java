package RecursionOnArrays;

import InputUtilites.InputUtils;

public class PrintArray {

    public static void main(String[] args) {
        Integer size = InputUtils.integer();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = InputUtils.integer();
        }

        printArray(arr, 0);
    }

    private static void printArray(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }

        System.out.println(arr[idx]);
        printArray(arr, idx + 1);
    }
}

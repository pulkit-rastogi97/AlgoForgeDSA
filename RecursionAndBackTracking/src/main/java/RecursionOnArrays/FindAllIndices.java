package RecursionOnArrays;

import InputUtilites.InputUtils;

import java.util.Arrays;

public class FindAllIndices {
    public static void main(String[] args) {
        Integer size = InputUtils.inputInteger();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = InputUtils.inputInteger();
        }

        Integer target = InputUtils.inputInteger();

        Integer[] indices = findAllIndices(arr, 0, target, 0);
        System.out.println("Array size: " + indices.length);
        for(Integer x: indices){
            System.out.print(x + " ");
        }
    }

    private static Integer[] findAllIndices(int[] arr, int index, Integer target, int count) {
        if(index == arr.length){
            return new Integer[count];
        }

        if(arr[index] == target){
            count++;
        }

        Integer[] allIndices = findAllIndices(arr, index + 1, target, count);

        if(target == arr[index]){
            allIndices[count - 1] = index;
        }

        return allIndices;

    }
}

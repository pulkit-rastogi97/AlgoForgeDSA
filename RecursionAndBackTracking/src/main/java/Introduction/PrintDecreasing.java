package Introduction;

import InputUtilites.InputUtils;

public class PrintDecreasing {
    public static void main(String[] args) {
        Integer n = InputUtils.integer();

        printDecreasing(n);
    }

    private static void printDecreasing(Integer n) {

        if(n == 0){
            return;
        }

        System.out.println(n);

        printDecreasing(n - 1);
    }


}

package Introduction;

import InputUtilites.InputUtils;

public class PrintDecreasingIncreasing {

    public static void main(String[] args) {
        Integer n = InputUtils.inputInteger();

        printDecreasingIncreasing(n);

    }

    private static void printDecreasingIncreasing(Integer n) {
        System.out.println(n);
        if(n == 1)
            return;
        printDecreasingIncreasing(n - 1);
        System.out.println(n);
    }
}

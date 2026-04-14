package Introduction;

import InputUtilites.InputUtils;

public class PrintIncreasing {

    public static void main(String[] args) {
        Integer n = InputUtils.inputInteger();

        printIncreasing(n);
    }

    private static void printIncreasing(Integer n) {
        if(n == 0)
            return;
        printIncreasing(n - 1);
        System.out.println(n);
    }
}

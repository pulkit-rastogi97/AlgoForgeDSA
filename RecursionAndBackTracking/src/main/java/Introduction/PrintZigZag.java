package Introduction;

import InputUtilites.InputUtils;

public class PrintZigZag {
    public static void main(String[] args) {
        Integer num = InputUtils.integer();
        printZigZag(num);
    }

    private static void printZigZag(Integer num) {
        if(num == 0)
            return ;

        System.out.print(num + " ");
        printZigZag(num - 1);
        System.out.print(num + " ");
        printZigZag(num - 1);
        System.out.print(num + " ");
    }
}

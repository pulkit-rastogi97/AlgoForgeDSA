package Introduction;

import InputUtilites.InputUtils;

public class FactorialOfN {

    public static void main(String[] args) {

        Integer n = InputUtils.inputInteger();

        Integer factorial = factorial(n);
        System.out.println(factorial.intValue());
    }

    private static Integer factorial(Integer n) {
        if(n <= 1){
            return 1;
        }
        
        Integer smallerAns = factorial(n - 1);
        return n * smallerAns;
    }
}

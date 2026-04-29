package Introduction;

import InputUtilites.InputUtils;

public class XPowY {

    public static void main(String[] args) {
        Integer x = InputUtils.integer();
        Integer y = InputUtils.integer();

//        Integer result = pow(x, y);
        Integer result = powLogN(x, y);
        System.out.println(result);
    }

    private static Integer pow(Integer x, Integer y) {

        if(y == 1)
            return x;

        int smallAns = pow(x, y - 1);
        int result = smallAns * x;

        return result;
    }


    private static Integer powLogN(Integer x, Integer y) {

        if(y == 1)
            return x;

        int smallAns = powLogN(x, y / 2);
        int result = smallAns * smallAns;

        if(y % 2 != 0){
            result = result * x;
        }

        return result;
    }
}

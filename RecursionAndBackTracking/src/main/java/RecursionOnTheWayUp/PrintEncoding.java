package RecursionOnTheWayUp;

import InputUtilites.InputUtils;

public class PrintEncoding {

    public static void main(String[] args) {
        String str = InputUtils.string();

        printEncoding(str, "");
    }

    private static void printEncoding(String str, String answerSoFar) {
        if(str.isBlank()){
            String[] result = answerSoFar.split(" ");
            for(String s : result){
                if(s.isBlank())
                    continue;
                int number = Integer.parseInt(s);
                if(number >= 1 && number <= 26) {
                    System.out.print((char) ((number - 1) + 'a'));
                }else{
                    return;
                }
            }
            System.out.println();
            return;
        }

        if(str.charAt(0) == '0')
            return;

        //1 character
        if(str.length() >= 1)
            printEncoding(str.substring(1), answerSoFar.concat(String.valueOf(str.charAt(0))).concat(" "));

        //2 character
        if(str.length() >= 2)
            printEncoding(str.substring(2), answerSoFar.concat(str.substring(0, 2)).concat(" "));
    }

}

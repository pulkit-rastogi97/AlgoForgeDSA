package InputUtilites;

import java.util.Scanner;

public class InputUtils {

    static Scanner scanner = new Scanner(System.in);

    public static Integer integer(){
        return scanner.nextInt();
    }

    public static Integer[] array(){
        int size = InputUtils.integer();

        Integer[] arr = new Integer[size];
        for(int i = 0; i < size; i++){
            arr[i] = InputUtils.integer();
        }

        return arr;
    }

    public static String string(){
        return scanner.next();
    }
}

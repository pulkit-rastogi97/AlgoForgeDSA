package Introduction;

import InputUtilites.InputUtils;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Integer numberOfRings = InputUtils.inputInteger();

        towerOfHanoi(numberOfRings, "A", "C", "B");
    }

    private static void towerOfHanoi(Integer numberOfRings, String source, String target, String auxiliary) {
        if(numberOfRings == 0){
            return;
        }

        towerOfHanoi(numberOfRings - 1, source, auxiliary, target);

        System.out.println("Move " + numberOfRings + " from " + source + " to " + target);

        towerOfHanoi(numberOfRings - 1, auxiliary, target, source);

    }
}

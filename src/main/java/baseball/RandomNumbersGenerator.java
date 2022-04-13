package baseball;

import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumbersGenerator {
    private final ArrayList<Integer> randomNumbers;

    RandomNumbersGenerator() {
        randomNumbers = new ArrayList<>();
        while(randomNumbers.size() < GameRule.MAX_LENGTH) {
            appendRandomNumber();
        }

    }

    public ArrayList<Integer> getRandomNumbers() {
        return randomNumbers;
    }

    private void appendRandomNumber() {
        int pickNumber = Randoms.pickNumberInRange(GameRule.MIN_VALUE, GameRule.MAX_VALUE);
        if (checkNumberValidation(pickNumber)) {
            randomNumbers.add(pickNumber);
        }
    }

    private Boolean checkNumberValidation(int number) {
        return !randomNumbers.contains(number);
    }
}

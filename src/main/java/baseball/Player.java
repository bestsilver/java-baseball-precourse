package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Player {
    private final ArrayList<Integer> playerNumbers;

    Player(String userinput) throws IllegalArgumentException {
        checkPlayerNumberStr(userinput);

        playerNumbers = convertStringToArrayInteger(userinput);
    }

    private boolean checkPlayerNumberStr(String str) throws IllegalArgumentException {
        return checkInputLength(str)  && checkDuplicate(str) && checkNumberValidate(str);
    }

    private boolean checkInputLength(String str) throws IllegalArgumentException {
        if(str.length() == GameRule.MAX_LENGTH) {
            return true;
        }
        throw new IllegalArgumentException(IllegalArgumentException.MSG_INPUT_LENGTH);
    }

    private boolean checkDuplicate(String str) throws IllegalArgumentException {
        Set<Character> checkStrSet = new HashSet<>();
        char[] charArr = str.toCharArray();

        for (char c : charArr) {
            checkStrSet.add(c);
        }

        if (checkStrSet.size() != GameRule.MAX_LENGTH) {
            throw new IllegalArgumentException(IllegalArgumentException.MSG_DUPLICATE_VALUE);
        }

        return true;
    }

    private boolean checkNumberValidate(String str) throws IllegalArgumentException {
        String regex = String.format("[%d-%d]{%d}", GameRule.MIN_VALUE, GameRule.MAX_VALUE, GameRule.MAX_LENGTH);

        if (str.matches(regex)) {
            return true;
        }
        throw new IllegalArgumentException(IllegalArgumentException.MSG_NUMBER_VALIDATE);
    }

    private ArrayList<Integer> convertStringToArrayInteger(String userStr) {
        ArrayList<Integer> userNumbers = new ArrayList<>();
        char[] userInputChars = userStr.toCharArray();

        for (char userInputChar : userInputChars) {
            userNumbers.add(Character.getNumericValue(userInputChar));
        }

        return userNumbers;
    }

    public ArrayList<Integer> getPlayerNumbers() {
        return playerNumbers;
    }

}

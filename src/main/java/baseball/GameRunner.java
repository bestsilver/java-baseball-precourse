package baseball;

import java.util.ArrayList;

public class GameRunner {
    ArrayList<Integer> randomNums;
    public final String PLEASE_INPUT_NUMBERS = "숫자를 입력해주세요 : ";
    public final String VICTORY_WORD = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    GameRunner() {
        randomNums = new RandomNumbersGenerator().getRandomNumbers();
    }

    public void run() {
        GameResult result = tryToGuess(randomNums);
        System.out.println(result.printGameResult());

        while(result.getStrikeCnt() != GameRule.MAX_LENGTH) {
            result = tryToGuess(randomNums);
            System.out.println(result.printGameResult());
        }

        System.out.println(VICTORY_WORD);

    }

    private boolean checkUserInputStr(String str) {
        try {
            return Player.checkPlayerNumberStr(str);
        } catch (WrongPlayerNumberException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private GameResult tryToGuess(ArrayList<Integer> randoms) {
        boolean isUserinputValid = false;
        String userinput = "";
        while(!isUserinputValid) {
            System.out.print(PLEASE_INPUT_NUMBERS);
            userinput = UserInputView.getUserInput();
            isUserinputValid = checkUserInputStr(userinput);
        }

        return new Referee(randoms, new Player(userinput).getPlayerNumbers()).getGameResult();
    }
}

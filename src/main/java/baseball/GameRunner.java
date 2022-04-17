package baseball;

import java.util.ArrayList;

public class GameRunner {
    private ArrayList<Integer> randomNums;
    public static final String PLEASE_INPUT_NUMBERS = "숫자를 입력해주세요 : ";
    public static final String VICTORY_WORD = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    GameRunner() {
        randomNums = new RandomNumbersGenerator().getRandomNumbers();
    }

    public void run() throws IllegalArgumentException {
        GameResult result = tryToGuess(randomNums);
        System.out.println(result.printGameResult());

        while(result.getStrikeCnt() != GameRule.MAX_LENGTH) {
            result = tryToGuess(randomNums);
            System.out.println(result.printGameResult());
        }

        System.out.println(VICTORY_WORD);

    }

    private GameResult tryToGuess(ArrayList<Integer> randoms) throws IllegalArgumentException {

        System.out.print(PLEASE_INPUT_NUMBERS);
        String userinput = UserInputView.getUserInput();

        return new Referee(randoms, new Player(userinput).getPlayerNumbers()).getGameResult();
    }
}

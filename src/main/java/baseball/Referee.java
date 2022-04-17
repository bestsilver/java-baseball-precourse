package baseball;

import java.util.ArrayList;

public class Referee {
    private GameResult gameResult;

    Referee(ArrayList<Integer> randomNums, ArrayList<Integer> playerNums) {
        gameResult = new GameResult();
        for (int i=0; i < GameRule.MAX_LENGTH; i++) {
            addBallType(i, playerNums.get(i), randomNums);
            addStrikeType(randomNums.get(i), playerNums.get(i));
        }
    }

    private void addBallType(int randomNumIndex, Integer playerNum, ArrayList<Integer> randomNums) {
        if ((randomNums.get(randomNumIndex).intValue() != playerNum.intValue()) && randomNums.contains(playerNum)) {
            gameResult.updateResultType(MatchType.BALL);
        }
    }

    private void addStrikeType(Integer randomNum, Integer playerNum) {
        if (randomNum.intValue() == playerNum.intValue()){
            gameResult.updateResultType(MatchType.STRIKE);
        }
    }

    public GameResult getGameResult() {
        return this.gameResult;
    }

}

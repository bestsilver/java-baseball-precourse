package baseball;

import java.util.HashMap;
import java.util.Map;

public class GameResult {
    private Map<MatchType, Integer> gameResult;

     GameResult() {
        gameResult = new HashMap<>();
        gameResult.put(MatchType.STRIKE, 0);
        gameResult.put(MatchType.BALL, 0);
        gameResult.put(MatchType.NOTHING, 0);
    }

    public void updateResultType(MatchType match) {
        int matchNum = gameResult.get(match);

        gameResult.put(match, matchNum + 1);
    }

    public int getStrikeCnt() {
        return gameResult.get(MatchType.STRIKE);
    }

    public int getBallCnt() {
        return gameResult.get(MatchType.BALL);
    }

    public String printStrikeResult() {
         String resultWord = "";

         if (getStrikeCnt() > 0) {
             resultWord += getStrikeCnt() + MatchType.STRIKE_WORD;
         }

         return resultWord;
    }

    public String printBallResult() {
         String resultWord = "";

         if (getBallCnt() > 0) {
             resultWord += getBallCnt() + MatchType.BALL_WORD;
         }

         return resultWord;
    }

    public String printNothingResult() {
         String resultWord = "";

         if (getBallCnt() + getStrikeCnt() == 0) {
             resultWord = MatchType.NOTHING_WORD;
         }

         return resultWord;
    }

    public String printGameResult() {
        String resultWord = "";

        if (getBallCnt() + getStrikeCnt() > 0) {
            resultWord += printBallResult() + " " + printStrikeResult();
            return resultWord.trim();
        }

        return printNothingResult();
    }
}

package baseball;

import java.util.HashMap;
import java.util.Map;

public class GameResult {
    private Map<MatchType, Integer> gameResult;

     GameResult() {
        gameResult = new HashMap<>();
        gameResult.put(MatchType.Strike, 0);
        gameResult.put(MatchType.Ball, 0);
        gameResult.put(MatchType.Nothing, 0);
    }

    public void updateResultType(MatchType match) {
        int matchNum = gameResult.get(match);

        gameResult.put(match, matchNum + 1);
    }

    public int getStrikeCnt() {
        return gameResult.get(MatchType.Strike);
    }

    public int getBallCnt() {
        return gameResult.get(MatchType.Ball);
    }
}

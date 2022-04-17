package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameResultTest {
    private GameResult gameResult;

    @BeforeEach
    public void createGameResult() { gameResult = new GameResult(); }

    @Test
    public void matchAlrightGameScore() {
        gameResult.updateResultType(MatchType.Strike);
        gameResult.updateResultType(MatchType.Ball);

        assertEquals(1, gameResult.getStrikeCnt());
        assertEquals(1, gameResult.getBallCnt());
    }

    @Test
    public void matchAlrightGameScorePrint() {
        gameResult.updateResultType(MatchType.Strike);
        gameResult.updateResultType(MatchType.Strike);
        gameResult.updateResultType(MatchType.Ball);

        assertEquals("1볼 2스트라이크 ", gameResult.printGameResult());
    }

}

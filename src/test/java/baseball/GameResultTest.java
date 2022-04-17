package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameResultTest {
    private GameResult gameResult;

    @BeforeEach
    public void createGameResult() { gameResult = new GameResult(); }

    @DisplayName("주어진 MatchType이 gameResult에 잘 매치되는 지 확인")
    @Test
    public void matchAlrightGameScore() {
        gameResult.updateResultType(MatchType.STRIKE);
        gameResult.updateResultType(MatchType.BALL);

        assertEquals(1, gameResult.getStrikeCnt());
        assertEquals(1, gameResult.getBallCnt());
    }

    @DisplayName("gameResult의 결과 프린트 확인")
    @Test
    public void matchAlrightGameScorePrint() {
        gameResult.updateResultType(MatchType.STRIKE);
        gameResult.updateResultType(MatchType.STRIKE);
        gameResult.updateResultType(MatchType.BALL);

        assertEquals("1볼 2스트라이크 ", gameResult.printGameResult());
    }

}

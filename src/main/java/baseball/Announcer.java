package baseball;

public class Announcer {
    public static final String PLEASE_INPUT_NUMBERS = "숫자를 입력해주세요 : ";
    public static final String GAME_COMMAND = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요";
    public static final String VICTORY_WORD = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public static String printGameResult(GameResult result) {
        String resultWord = "";
        if (result.getBallCnt() > 0) {
            resultWord += result.getBallCnt() + MatchType.BALL_WORD + " ";
        }

        if (result.getStrikeCnt() > 0) {
            resultWord += result.getStrikeCnt() + MatchType.STRIKE_WORD + " ";
        }

        if (resultWord.length() == 0) {
            return MatchType.NOTHING_WORD;
        }

        return resultWord;
    }
}

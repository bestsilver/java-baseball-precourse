package baseball;

public class OpinionInput {
    public static final String GAME_COMMAND = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요";

    public GameState getOpinition() throws IllegalArgumentException {

        System.out.println(GAME_COMMAND);
        String userinput = UserInputView.getUserInput();

        if (!checkUserOpinionValidate(userinput)) {
            throw new IllegalArgumentException(IllegalArgumentException.MSG_GAME_STATE_CODE);
        }

        return GameState.getGameStateOf(Integer.parseInt(userinput));
    }

    public boolean checkUserOpinionValidate(String opinion) {
        String regexStr = String.format("%s|%s", GameState.RESERT, GameState.QUIT);
        return opinion.matches(regexStr);
    }
}

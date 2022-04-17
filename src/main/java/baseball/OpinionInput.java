package baseball;

public class OpinionInput {
    public static final String GAME_COMMAND = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요";

    public GameState getOpinion() throws IllegalArgumentException {

        System.out.println(GAME_COMMAND);
        String userinput = UserInputView.getUserInput();

        if (!checkUserOpinionValidate(userinput)) {
            throw new IllegalArgumentException(IllegalArgumentException.MSG_GAME_STATE_CODE);
        }

        return GameState.getGameStateOf(Integer.parseInt(userinput));
    }

    private boolean checkUserOpinionValidate(String opinion) {
        String regexStr = String.format("%s|%s", GameState.RESTART_VALUE, GameState.QUIT_VALUE);
        return opinion.matches(regexStr);
    }
}

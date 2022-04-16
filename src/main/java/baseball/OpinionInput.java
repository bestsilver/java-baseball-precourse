package baseball;

public class OpinionInput {
    public static final String GAME_COMMAND = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요";

    public GameState getOpinition() {
        String userinput = "";

        while (!checkUserOpinionValidate(userinput)) {
            System.out.println(GAME_COMMAND);
            userinput = UserInputView.getUserInput();
        }

        return GameState.getGameStateOf(Integer.parseInt(userinput));
    }

    public boolean checkUserOpinionValidate(String opinion) {
        String regexStr = String.format("%s|%s", GameState.RESERT, GameState.QUIT);
        return opinion.matches(regexStr);
    }
}

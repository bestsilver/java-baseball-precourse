package baseball;

public enum GameState {
    RESTART, QUIT;
    public static final int RESTART_VALUE = 1;
    public static final int QUIT_VALUE = 2;

    public static GameState getGameStateOf(int num) {
        if (num == 1) {
            return RESTART;
        }

        if (num == 2) {
            return QUIT;
        }

        return null;
    }
}

package baseball;

public enum GameState {
    restart, quit;
    public static final int RESERT = 1;
    public static final int QUIT = 2;

    public static GameState getGameStateOf(int num) {
        if (num == 1) {
            return restart;
        }

        if (num == 2) {
            return quit;
        }

        return null;
    }
}

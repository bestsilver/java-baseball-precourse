package baseball;

public class Application {
    public static void main(String[] args) {
        GameState opinion = GameState.RESTART;

        while (opinion == GameState.RESTART) {
            GameRunner runner = new GameRunner();
            runner.run();
            opinion = new OpinionInput().getOpinion();
        }

    }

}

package baseball;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameState opinion = GameState.restart;

        while (opinion == GameState.restart) {
            GameRunner runner = new GameRunner();
            runner.run();
            opinion = new OpinionInput().getOpinition();
        }

    }

}

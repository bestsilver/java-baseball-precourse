package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OpinionInputTest {

    private OpinionInput opinionInput;

    @BeforeEach
    public void createOpinionInput() { opinionInput = new OpinionInput();}

    @DisplayName("게임의 재시작, 종료를 물을 때 1 또는 2를 제외한 문자가 입력되었을 경우")
    @Test
    public void checkPlayerOpinionValidateTest() {
        String opinion = "3";

        assertThatThrownBy(() -> {
            System.setIn(new ByteArrayInputStream(opinion.getBytes()));
            opinionInput.getOpinion();
        })
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage(IllegalArgumentException.MSG_GAME_STATE_CODE);
    }

}

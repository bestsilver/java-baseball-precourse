package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OpinionInputTest {

    private OpinionInput opinionInput;

    @BeforeEach
    public void createOpinionInput() { opinionInput = new OpinionInput();}

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

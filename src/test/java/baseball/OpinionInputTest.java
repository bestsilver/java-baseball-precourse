package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OpinionInputTest {

    private OpinionInput opinionInput;

    @BeforeEach
    public void createOpinionInput() { opinionInput = new OpinionInput();}

    @Test
    public void checkPlayerOpinionValidateTest() {
        String opinion = "3";

        assertFalse(opinionInput.checkUserOpinionValidate(opinion));

    }

}

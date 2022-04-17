package baseball;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayerTest {
    @Test
    public void throwErrorInCaseInvalidLength() {
        String userinput = "1234";

        assertThatThrownBy(() -> new Player(userinput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(IllegalArgumentException.MSG_INPUT_LENGTH);
    }

    @Test
    public void throwErrorInCaseDuplicate() {
        String userinput = "112";

        assertThatThrownBy(() -> new Player(userinput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(IllegalArgumentException.MSG_DUPLICATE_VALUE);
    }

    @Test
    public void throwErrorInCaseNotNumber() {
        String userinput = "abc";

        assertThatThrownBy(() -> new Player(userinput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(IllegalArgumentException.MSG_NUMBER_VALIDATE);
    }
}

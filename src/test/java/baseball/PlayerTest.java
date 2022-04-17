package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayerTest {

    @DisplayName("입력된 숫자가 3자리가 아닌 경우")
    @Test
    public void throwErrorInCaseInvalidLength() {
        String userinput = "1234";

        assertThatThrownBy(() -> new Player(userinput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(IllegalArgumentException.MSG_INPUT_LENGTH);
    }

    @DisplayName("입력된 숫자에 중복 숫자가 있을 경우")
    @Test
    public void throwErrorInCaseDuplicate() {
        String userinput = "112";

        assertThatThrownBy(() -> new Player(userinput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(IllegalArgumentException.MSG_DUPLICATE_VALUE);
    }

    @DisplayName("입력된 문자가 숫자가 아닌 경우")
    @Test
    public void throwErrorInCaseNotNumber() {
        String userinput = "abc";

        assertThatThrownBy(() -> new Player(userinput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(IllegalArgumentException.MSG_NUMBER_VALIDATE);
    }
}

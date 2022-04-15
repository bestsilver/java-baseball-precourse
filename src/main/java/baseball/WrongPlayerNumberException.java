package baseball;

public class WrongPlayerNumberException extends RuntimeException {
    public static final String MSG_INPUT_LENGTH = "[ERROR] 3자리의 숫자만 입력할 수 있습니다.";
    public static final String MSG_DUPLICATE_VALUE = "[ERROR] 서로 다른 3가지 숫자를 입력해주세요.";
    public static final String MSG_NUMBER_VALIDATE = "[ERROR] 1~9 범위의 3자리 숫자만 입력할 수 있습니다.";
    public WrongPlayerNumberException(final String errorMessage) {super(errorMessage);}
}

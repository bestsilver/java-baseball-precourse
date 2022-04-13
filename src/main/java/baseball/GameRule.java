package baseball;

public enum GameRule {
    MaxLength(3),
    MaxValue(9),
    MinValue(1);
    public static final int MAX_LENGTH = 3;
    public static final int MAX_VALUE = 9;
    public static final int MIN_VALUE = 1;
    private int rule;
    private GameRule(int rule) { this.rule = rule; }
}

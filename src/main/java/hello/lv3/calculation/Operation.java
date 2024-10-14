package hello.lv3.calculation;

// 함수형 인터페이스 임포트
import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    MULTI("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final DoubleBinaryOperator op; // 람다식을 저장할 필드

    private final String symbol;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() { return symbol; }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
    public static Operation fromCode(String code) {
        for (Operation color : Operation.values()) {
            if (color.symbol.equals(code)) {
                return color;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + code);
    }

}
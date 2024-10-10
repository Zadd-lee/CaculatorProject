package hello.LV3.calculation;

public enum Operation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTI("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    // 클래스 생성자와 멤버
    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    // toString을 재정의하여 열거 객체의 매핑된 문자열을 반환하도록
    @Override
    public String toString() {
        return symbol;
    }

    // 열거 객체의 메소드에 사용될 추상 메소드 정의
    public abstract double apply(double x, double y);


    public static Operation fromCode(String code) {
        for (Operation color : Operation.values()) {
            if (color.symbol.equals(code)) {
                return color;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + code);
    }

}

package calculator;

import java.util.Arrays;
import java.util.Optional;

public enum OperatorType {
    PLUS('+', new AddOperator()),
    MINUS('-', new SubtractOperator()),
    MUL('*', new MultiplyOperator()),
    DIVIDE('/', new DivideOperator()),
    MOD('%', new DivideOperator());

    private char operatorChar;
    private Operator operator;

    OperatorType(char operatorChar, Operator operator) {
        this.operatorChar = operatorChar;
        this.operator = operator;
    }

    public static Optional<OperatorType> of(char operator) {
        return Arrays.stream(OperatorType.values()).filter(t -> t.operatorChar == operator).findFirst();
    }

    public double operate(double num1, double num2) {
        return operator.operate(num1, num2);
    }
}

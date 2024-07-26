package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator<Integer>{

    public ArithmeticCalculator() {
        super();
        resultList = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) throws Exception {
        Operator op = switch (operator) {
            case '+' -> new AddOperator();
            case '-' -> new SubtractOperator();
            case '*' -> new MultiplyOperator();
            case '/' -> new DivideOperator();
            case '%' -> new ModOperator();
            default -> throw new RuntimeException("잘못된 연산자 기호 입니다.");
        };

        return op.operate(num1, num2);
    }

    public void removeResult() {
        resultList.removeFirst();
    }
}

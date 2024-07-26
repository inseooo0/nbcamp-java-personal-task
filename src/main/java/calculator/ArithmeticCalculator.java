package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator() {
        super();
        resultList = new ArrayList<>();
    }

    public double calculate(int num1, int num2, char operator) throws Exception {
        switch (operator) {
            case '+':
                return new AddOperator().operate(num1, num2);
            case '-':
                return new SubtractOperator().operate(num1, num2);
            case '*':
                return new MultiplyOperator().operate(num1, num2);
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    return new DivideOperator().operate(num1, num2);
                }
            default:
                throw new RuntimeException("잘못된 연산자 기호입니다.");
        }
    }

    public void removeResult() {
        resultList.removeFirst();
    }
}

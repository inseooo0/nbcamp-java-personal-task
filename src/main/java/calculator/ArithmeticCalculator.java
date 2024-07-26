package calculator;

import java.util.ArrayList;
import java.util.Optional;

public class ArithmeticCalculator extends Calculator<Integer>{

    public ArithmeticCalculator() {
        super();
        resultList = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) throws Exception {
        Optional<OperatorType> operatorType = OperatorType.of(operator);

        if (operatorType.isEmpty()) {
            throw new RuntimeException("잘못된 연산 기호입니다.");
        }

        return operatorType.get().operate(num1, num2);
    }

    public void removeResult() {
        resultList.removeFirst();
    }
}

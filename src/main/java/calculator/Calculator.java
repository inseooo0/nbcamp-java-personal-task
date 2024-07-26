package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> resultList;

    public Calculator() {
        resultList = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) throws Exception {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    return num1 / num2;
                }
            default:
                throw new RuntimeException("잘못된 연산자 기호입니다.");
        }
    }

    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    public void removeResult() {
        resultList.removeFirst();
    }

    public void inquiryResults() {
        for (Integer i : resultList) {
            System.out.println("지난 연산 결과 = " + i);
        }
    }
}

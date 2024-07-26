package calculator;

import java.util.List;

public abstract class Calculator<T> {

    List<T> resultList;
    public static final Double PI = 3.14; // 변하지 않는 상수(final)이고 Calculator 생성 없이 외부에서 접근 가능(static)

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    public void inquiryResults() {
        for (T i : resultList) {
            System.out.println("지난 연산 결과 = " + i);
        }
    }
}

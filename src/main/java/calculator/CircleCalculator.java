package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{

    public CircleCalculator() {
        super();
        resultList = new ArrayList<>();
    }

    public double calculateCircleArea(int num) {
        return num * num * PI;
    }
}

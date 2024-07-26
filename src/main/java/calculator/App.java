package calculator;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("연산 종류를 선택하세요(사칙연산:1, 원의 넓이:2): ");
            switch (sc.nextInt()) {
                case 1:

                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int num2 = sc.nextInt();

                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);

                    int result = arithmeticCalculator.calculate(num1, num2, operator);
                    System.out.println("결과: " + result);

                    List<Integer> resultList = arithmeticCalculator.getResultList();
                    resultList.add(result);
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                    if (sc.next().equals("remove")) {
                        arithmeticCalculator.removeResult();
                    }
                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    if (sc.next().equals("inquiry")) {
                        arithmeticCalculator.inquiryResults();
                    }
                    break;
                case 2:

                    System.out.print("반지름을 입력하세요: ");
                    int num = sc.nextInt();

                    double area = circleCalculator.calculateCircleArea(num);
                    System.out.println("결과: " + area);

                    circleCalculator.getResultList().add(area);
                    circleCalculator.inquiryResults();
                    break;
                default:
                    throw new RuntimeException("잘못된 입력입니다. (1 또는 2만 입력 가능)");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        } while (!sc.next().equals("exit"));
    }
}

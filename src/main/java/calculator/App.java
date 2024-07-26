package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        List<Integer> resultList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }
            System.out.println("결과: " + result);

            resultList.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (sc.next().equals("remove")) {
                resultList.removeFirst();
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                for (Integer i : resultList) {
                    System.out.println("지난 연산 결과= " + i);
                }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        } while (!sc.next().equals("exit"));
    }
}

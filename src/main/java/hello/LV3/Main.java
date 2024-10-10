package hello.LV3;

import hello.LV3.calculation.ArithmeticCalculator;
import hello.LV3.calculation.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Operation.MULTI);
        while (true) {
            //Double 사이즈의 값 받아오기
            System.out.println("첫번째 숫자를 입력하세요");
            String inputA = sc.nextLine();
            System.out.println("두번째 숫자를 입력하세요");
            String inputB = sc.nextLine();
            System.out.println("사칙 연산을 입력하세요");
            String operator = sc.nextLine();

            //계산 수행
            ArithmeticCalculator cal = new ArithmeticCalculator();
            try {
                Double result = cal.Calculator(inputA, inputB, operator);
            } catch (ArithmeticException e) {
                System.out.println("0 으로 나눌 수 없습니다.");
            }


            System.out.println("다시 진행하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 계산된 결과를 지우시겠습니까? (remove 입력 시 삭제)");
            //메세지가 exit인 경우 반복문 탈출
            //메세지가 remove 인 경우 Calculator의 가장 먼저 계산된 결과를 삭제
            String command = sc.nextLine();
            if (command.equals("exit")) break;
            if(command.equals("remove")) {cal.removeResult();}
        }
    }
}
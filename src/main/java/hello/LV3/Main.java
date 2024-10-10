package hello.LV3;

import hello.LV3.calculation.ArithmeticCalculator;
import hello.LV3.calculation.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        ArithmeticCalculator cal = new ArithmeticCalculator();

        while (true) {
            //Double 사이즈의 값 받아오기

            try {
                System.out.println("첫번째 숫자를 입력하세요");
                double inputA = parser.parseInput(sc.nextLine());
                System.out.println("두번째 숫자를 입력하세요");
                double inputB = parser.parseInput(sc.nextLine());
                System.out.println("사칙 연산을 입력하세요");
                Operation operator = parser.parseOperator(sc.nextLine());

                //계산 수행
                Double result = cal.Calculate(inputA, inputB, operator);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0 으로 나눌 수 없습니다.");
            } catch (NumberFormatException e) {
                System.out.println("올바른 숫자 값을 넣으세요");
            } catch (IllegalArgumentException e) {
                System.out.println("올바른 연산자를 넣으세요");
            }


            System.out.println("다시 진행하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 계산된 결과를 지우시겠습니까? (remove 입력 시 삭제)");
            //메세지가 exit인 경우 반복문 탈출
            //메세지가 remove 인 경우 Calculator의 가장 먼저 계산된 결과를 삭제
            String command = sc.nextLine();
            if (command.equals("exit")) break;
            if(command.equals("remove")) cal.removeResult();
        }
    }
}
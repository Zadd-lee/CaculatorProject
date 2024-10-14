package hello.lv3;

import hello.lv3.calculation.ArithmeticCalculator;
import hello.lv3.calculation.Operation;
import hello.lv3.calculation.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        //input 값이 int -> double 이므로 double 타입에 맞는 generic 함수 선언
        ArithmeticCalculator<Double> cal = new ArithmeticCalculator<>();

        while (true) {
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


            System.out.println("----command----");
            System.out.println("계산기 끝내기(exit 입력 시 종료)");
            System.out.println("가장 먼저 계산된 결과를 삭제 (remove 입력 시 삭제)");
            System.out.println("계산 결과를 보기 (history 입력 시 출력)");
            System.out.println("가장 큰 계산 결과 보기 (maxHistory 입력 시 출력)");
            String command = sc.nextLine();
            //메세지가 exit인 경우 반복문 탈출
            if (command.equals("exit")) break;
            //메세지가 remove 인 경우 Calculator의 가장 먼저 계산된 결과를 삭제
            if(command.equals("remove")) cal.removeResult();
            //메세지가 hisotory일 경우 결과값 모두 출력
            if(command.equals("history")) cal.getResultHistory().stream().forEach(f->{System.out.println(f);});
            //maxHistory 일 경우 결과값에서 가장 큰 값 출력
            if(command.equals("maxHistory")) System.out.println(cal.getResultHistory().stream().mapToDouble(x->x).max().getAsDouble());
        }
    }
}
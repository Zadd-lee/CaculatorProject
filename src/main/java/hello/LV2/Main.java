package hello.LV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //값 받아오기
            System.out.println("첫번째 숫자를 입력하세요");
            int inputA = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요");
            int inputB = sc.nextInt();
            //버퍼 지우기
            sc.nextLine();
            System.out.println("사칙 연산을 입력하세요");
            char operater = sc.nextLine().charAt(0);


            Calculator cal = new Calculator();
            Integer result = cal.Calculator(inputA, inputB, operater);
            //에러가 나지 않은 정상 값만 출력하는 동작
            if (result != null) {
                System.out.println("결과는 " + result + " 입니다");
            }
            System.out.println("다시 진행하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 계산된 결과를 지우시겠습니까? (remove 입력 시 삭제)");
            //입력값이 exit인 경우 반복문 탈출
            //입력값이 remove인 경우 Calculator 객체의 제일 먼저 계산한 저장 결과 삭제
            String command = sc.nextLine();
            if (command.equals("exit")) break;
            if(command.equals("remove")) {cal.removeResult();}
        }
    }
}
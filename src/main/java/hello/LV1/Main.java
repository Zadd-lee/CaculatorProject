package hello.LV1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //값을 입력받음
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 숫자를 입력하세요");
            int inputA = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요");
            int inputB = sc.nextInt();
            //버퍼 지우기
            sc.nextLine();
            System.out.println("사칙 연산을 입력하세요");
            char operater = sc.nextLine().charAt(0);

            int result = 0;

            switch (operater) {
                case '+':
                    result = inputA + inputB;
                    break;
                case '-':
                    result = inputA - inputB;
                    break;
                case '*':
                    result = inputA * inputB;
                    break;
                case '/':
                    if (inputB == 0) {
                        System.out.println("나눗셈 연산은 분모(두번째 정수)에 입력 될 수 없습니다.");
                        break;
                    }
                    result = inputA / inputB;
                    break;
            }


            System.out.println("결과는 " + result + " 입니다");
            System.out.println("다시 진행하시겠습니까? (exit 입력시 종료)");

            if (sc.nextLine().equals("exit")) break;
        }

        //String 값이 수식이 맞는지 확인

        //값을 계산기로 넣음
        //값을 출력함
    }
}

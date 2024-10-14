package hello.lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //값을 입력받음
        Scanner sc = new Scanner(System.in);

        while (true) {
            //값 받아오기
            System.out.println("첫번째 숫자를 입력하세요");
            int inputFirst = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요");
            int inputSecond = sc.nextInt();
            //버퍼 지우기
            sc.nextLine();
            System.out.println("사칙 연산을 입력하세요");
            char operater = sc.nextLine().charAt(0);

            //결과값을 담을 변수 선언 및 초기화
            int result = 0;

            //operater에 따라 사칙 연산 수행
            switch (operater) {
                case '+':
                    result = inputFirst + inputSecond;
                    break;
                case '-':
                    result = inputFirst - inputSecond;
                    break;
                case '*':
                    result = inputFirst * inputSecond;
                    break;
                case '/':
                    if (inputSecond == 0) {//0으로 나누는 경우, 에러 메세지 출력
                        System.out.println("나눗셈 연산은 분모(두번째 정수)에 입력 될 수 없습니다.");
                        break;
                    }
                    result = inputFirst / inputSecond;
                    break;
            }


            System.out.println("결과는 " + result + " 입니다");
            System.out.println("다시 진행하시겠습니까? (exit 입력시 종료)");
            //값이 exit 인 경우 반복문 탈출
            if (sc.nextLine().equals("exit")) break;
        }
    }
}

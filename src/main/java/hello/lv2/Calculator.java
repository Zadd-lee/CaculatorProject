package hello.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> resultHistory = new ArrayList<>();

    public List<Integer> getResultHistory() {
        return resultHistory;
    }

    public void setResultHistory(List<Integer> resultHistory) {
        this.resultHistory = resultHistory;
    }

    public Integer Calculator(int firstNum, int secondNum, char operator) {
        //에러일 경우 null 로 값을 표시해주기 위해 Integer 타입 변수 선언
        Integer result = 0;
        //operator 에 따라 사칙 연산 계산
        switch (operator) {
            case '+':
                result =   firstNum + secondNum;
                break;
            case '-':
                result =   firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {//만약 0으로 나누는 경우 에러 메세지 출력 및 null 값 리턴
                    System.out.println("나눗셈 연산은 분모(두번째 정수)에 입력 될 수 없습니다.");
                    //잘못된 연산의 경우 resultHistory에 값을 저장하지 않고 바로 return
                    return null;
                }
                result = firstNum / secondNum;
            default:
                System.out.println("올바른 연산을 입력해주세요.");
                //잘못된 연산의 경우 resultHistory에 값을 저장하지 않고 바로 return
                return null;
        }
        //계산 결과를 resultHistory 에 저장
        resultHistory.add(result);
        return result;
    }

    //가장 먼저 계산한 결과를 지우는 메서드
    public void removeResult(){
        resultHistory.remove(0);
    }



}
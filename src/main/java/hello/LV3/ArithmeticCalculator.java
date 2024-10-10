package hello.LV3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    private List<Double> resultHistory = new ArrayList<>();
    public List<Double> getResultHistory() {
        return resultHistory;
    }
    public void setResultHistory(List<Double> resultHistory) {
        this.resultHistory = resultHistory;
    }

    public Double Calculator(double a, double b, char operator) {
        Double result;
        //operator 에 따라 사칙 연산 수행
        switch (operator) {
            case '+':
                result =   a + b;
                break;
            case '-':
                result =   a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {//0으로 나누는 경우 에러 메세지 출력
                    System.out.println("나눗셈 연산은 분모(두번째 정수)에 입력 될 수 없습니다.");
                    //잘못된 연산의 경우 resultHistory에 값을 저장하지 않고 바로 return
                    return null;
                }
                result = a / b;
            default://잘못된 연산의 경우 에러 메세지 출력
                System.out.println("올바른 연산을 입력해주세요.");
                //잘못된 연산의 경우 resultHistory에 값을 저장하지 않고 바로 return
                return null;
        }
        resultHistory.add(result);
        return result;
    }
    //가장 먼저 계산한 결과를 삭제하는 메서드
    public void removeResult(){
        resultHistory.remove(0);
    }



}
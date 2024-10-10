package hello.LV2;

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

    public Integer Calculator(int a, int b, char operater) {
        Integer result = 0;
        switch (operater) {
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
                if (b == 0) {
                    System.out.println("나눗셈 연산은 분모(두번째 정수)에 입력 될 수 없습니다.");
                    return null;
                }
                result = a / b;
            default:
                System.out.println("올바른 연산을 입력해주세요.");
                return null;
        }
        resultHistory.add(result);
        return result;
    }

    public void removeResult(){
        resultHistory.remove(0);
    }



}
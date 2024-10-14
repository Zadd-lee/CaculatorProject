package hello.lv3.calculation;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {

    private List<Double> resultHistory = new ArrayList<>();

    public List<Double> getResultHistory() {
        return resultHistory;
    }

    public void setResultHistory(List<Double> resultHistory) {
        this.resultHistory = resultHistory;
    }


    public T Calculate(T firstNum, T secondNum, Operation operator) {


        //operator 에 따라 사칙 연산 계산
        Double result = operator.apply((double) firstNum, (double) secondNum);
        //결과값에 저장
        resultHistory.add(result);

        return (T) result;
    }

    //가장 먼저 계산한 결과를 삭제하는 메서드
    public void removeResult() {
        resultHistory.remove(0);
    }


}
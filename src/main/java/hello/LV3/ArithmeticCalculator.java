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



    public Double Calculator (double a, double b, String operator) throws ArithmeticException {
        Operation operation = Operation.valueOf(operator);
        Double result = operation.apply(a, b);
        resultHistory.add(result);
        return result;
    }
    //가장 먼저 계산한 결과를 삭제하는 메서드
    public void removeResult(){
        resultHistory.remove(0);
    }



}
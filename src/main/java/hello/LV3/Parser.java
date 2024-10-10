package hello.LV3;

import hello.LV3.calculation.Operation;


public class Parser {

    public double parseInput(String s) throws NumberFormatException {
        return Double.parseDouble(s);
    }


    public Operation parseOperator(String operator) throws IllegalArgumentException {
        return Operation.fromCode(operator);
    }
}

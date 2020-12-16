package vvcl.spring.calculator.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private int num ;

    public void baseNum(int base) {
        this.num = base;
    }

    public int currentBase() {
        return num;
    }

    public int add(int adder) {
        return this.num + adder;
    }

    public int accumulate(int adder) {
        this.num += adder;
        return this.num;
    }

    public int substract(int substractor) {
        return  this.num - substractor;
    }

    public int accumulateS(int substractor) {
        this.num -= substractor;
        return this.num;
    }
}

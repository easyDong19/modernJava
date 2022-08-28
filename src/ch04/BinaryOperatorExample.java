package ch04;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> operatorA = (Integer a, Integer b) -> a+b;

        System.out.println(operatorA.apply(1,2));
    }
}

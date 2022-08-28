package ch04;

import java.util.function.Function;

public class FunctionComposeExample {
    public static void main(String[] args) {
        Function<String, Integer> parseIntFunction =
                (String str) -> Integer.parseInt(str) + 1;
        Function<Integer,String> intToStrFunction =
                (Integer i) -> "String : " + Integer.toString(i);

        System.out.println(intToStrFunction.compose(parseIntFunction).apply("1000"));
    }
}

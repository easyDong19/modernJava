package ch04;

import java.util.function.Function;

public class FunctionExample {
    public static int executeFunction(String context, Function<String, Integer> function){
        return function.apply(context);
    }

    public static void main(String[] args) {
        int a = FunctionExample.executeFunction("Hello! Welcome to Java World.",
                (String context) -> context.length());
        System.out.println(a);
    }
}

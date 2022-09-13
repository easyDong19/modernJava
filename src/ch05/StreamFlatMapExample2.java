package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamFlatMapExample2 {
    public static void main(String[] args) {
        String[][] rawData = new String[][]{
                {"a","b"},{"c","d"},{"e","f"},{"a","h"}
        };

        List<String[]> rawList = Arrays.asList(rawData);

        rawList.stream()
                .flatMap(array->Arrays.stream(array))
                .filter(data -> "a".equals(data.toString()))
                .forEach(data -> System.out.println(data));


    }
}

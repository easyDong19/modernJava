package ch05;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        String[][] rawData = new String[][]{
                {"a","b"},{"c","d"},{"e","f"},{"a","h"}
        };

        List<String[]> rawList = Arrays.asList(rawData);
        rawList.stream().filter(array->"a".equals(array[0].toString()) || "a".equals(array[1].toString()))
                .forEach(array-> System.out.println(array[0] + array[1]));
    }
}

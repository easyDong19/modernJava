package ch05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceSumExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //for 문장을 이용한 계산
        int sumTemp = 0;
        for (int value : intList) {
            sumTemp += value;
        }

        //forEach를 사용
        int sum[] = {0};
        intList.stream().forEach(value -> sum[0]+= value);

        //IntStream 이용
        int sum1 = intList.stream().mapToInt(Integer::intValue).sum();

        //Stream.collect 이용
        int sum2 = intList.stream().collect(Collectors.summingInt(Integer::intValue));

        //메서드 참조로 정의
        int sum3 = intList.stream().reduce(0, Integer::sum);

        //람다 표현식으로 정의
        int sum4 = intList.stream().reduce(0,(x,y) -> x+y);

        //람다표현식 + 병렬 처리
        int sum5 = intList.parallelStream().reduce(0, (x,y)-> x+y);
    }
}

package ch05;

import ch04.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamMapExample2 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("장윤기",45));
        personList.add(new Person("장해라",18));
        personList.add(new Person("장해윤",14));
        personList.add(new Person("장윤기",45));


        IntStream intStream = personList.stream().mapToInt((Person p) -> p.getAge());
        intStream.forEach(System.out::println);
    }

}

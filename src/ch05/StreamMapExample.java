package ch05;

import ch04.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("장윤기",45));
        personList.add(new Person("장해라",18));
        personList.add(new Person("장해윤",14));
        personList.add(new Person("장윤기",45));

        Stream<String> personStream = personList.stream().map((Person p) -> p.toString());
        personStream.forEach(System.out::println);
    }
}

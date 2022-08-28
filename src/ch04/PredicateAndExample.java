package ch04;

import java.util.function.Predicate;

public class PredicateAndExample {
    public static Predicate<Person> isMale() {
        return (Person p) -> "male".equals(p.getSex());
    }
    public static Predicate<Person> isAdult() {
        return (Person p) -> p.getAge() > 20;
    }

    public static void main(String[] args) {
        Predicate<Person> predicateA = PredicateAndExample.isMale();
        Predicate<Person> predicateB = PredicateAndExample.isAdult();

        Predicate<Person> predicateAB = predicateA.and(predicateB);

    }
}

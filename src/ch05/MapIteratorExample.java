package ch05;

import ch04.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorExample {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        map.put("1", new Person("장윤기",45));
        map.put("2", new Person("장해라", 18));
        map.put("3", new Person("장해윤", 14));
        map.put("4", new Person("장윤기", 45));

        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(key);
        }

        for(Map.Entry<String,Person> element : map.entrySet()){
            System.out.println(String.format("key : %s, value : %s", element.getKey(),element.getValue()));
        }

        map.forEach((key,value)-> System.out.println(String.format("key: %s value : %s",key,value)));

    }
}

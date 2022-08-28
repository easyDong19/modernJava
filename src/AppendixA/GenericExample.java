package AppendixA;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        //3가지 타입의 List 객체 생성
        List mylist = new ArrayList();
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        System.out.println(mylist instanceof ArrayList);


    }
}

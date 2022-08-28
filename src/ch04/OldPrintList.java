package ch04;

import java.util.ArrayList;
import java.util.List;

public class OldPrintList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for(String entity : list ){
            System.out.println(entity);
        }
    }
}

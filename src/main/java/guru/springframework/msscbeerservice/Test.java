package guru.springframework.msscbeerservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar_contreras on 25/3/2020
 */
public class Test {

    public static void main(String[] args) {
        List<? super Exception> exception = new ArrayList<Object>();
        exception.add(new Exception());
        exception.add(new IOException());

        List<String> strings = new ArrayList<>();
        strings.add("String1");
        List<Object> obj = new ArrayList<>(strings);
        addSoung(strings);
        addSoung(obj);
    }

    public static void addSoung(List<? super String> list){
        list.add("otro");
    }
}

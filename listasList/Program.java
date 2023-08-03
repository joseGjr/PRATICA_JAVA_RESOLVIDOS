package listasList;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("alex");
        list.add("josé");
        list.add("firmino");
        list.add(2,"macolino");
        list.add(3,"maria rita");


        System.out.println(list.size());

        for (String x :list){
            System.out.println(x);
        }
        System.out.println("_____________________________");
        list.removeIf(x->x.charAt(0)=='m');
        for (String x :list){
            System.out.println(x);
        }
        System.out.println("________________________________");
        System.out.println("Index of bob: "+list.indexOf("bob"));
        System.out.println("Index of Marco: "+list.indexOf("Marco"));


        System.out.println("_________________________________");
        List<String>result = list.stream().filter(x->x.charAt(0) == 'a').collect(Collectors.toList());
        for (String x :result){
            System.out.println(x);
        }

        System.out.println("_________________________________");
        String name = list.stream().filter(x->x.charAt(0) == 'z').findFirst().orElse(null);
            System.out.println(name);

    }
}

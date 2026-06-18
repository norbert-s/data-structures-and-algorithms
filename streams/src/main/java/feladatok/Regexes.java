package feladatok;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Regexes {
    public static void main(String[] args) {
        boolean ez = "12345".matches("[0-9]");
        System.out.println(ez);

        //1. feladat:
        //Ellenőrizd hogy az email cím valid-e. Csak az alapstruktúrát nézd: van @ jel, előtte és utána is van valami, és van . az @ után.

        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        words.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).forEach((a,b)-> System.out.println(a+":"+b));

        words.stream()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream()
                .sorted((a,b)->b.getValue().compareTo(a.getValue())).limit(1)
                .forEach((a)-> System.out.println(a.getValue()));

        "007".matches("^0+");   // az elején van-e nulla
        "hello".matches("^h");  // h-val kezdődik-e

        //        "[^0]"   // nem nulla
        //        "[^a-z]" // nem kisbetű
        //        "[^\\s]" // nem whitespace

        "007".replaceAll("^0+", "");

        "     ".matches("\\s+");

        "192.168.1.1".matches("(\\d{1,3}\\.){3}\\d{1,3}");
    }
}

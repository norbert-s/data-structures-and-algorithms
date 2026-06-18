package feladatok;

import java.util.*;
import java.util.stream.Collectors;

public class Exercises {
    public static void main(String[] args) {
        List<String> words = List.of(
                "apple", "banana", "apple", "car", "banana", "dog", "elephant"
        );

        //        Adott egy List<Integer> számokkal.
        //
        //        Szűrd ki a páros számokat
        //        Képezd le őket négyzetre
        //        Gyűjtsd egy új listába
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0

        );
        nums.stream().filter(num -> num % 2 == 0).map(num -> num * num).collect(Collectors.toList());

        // Adott egy List<Integer>. Számold ki az összegét stream segítségével.
        int osszeg = nums.stream()
                .mapToInt(Integer::intValue) // Átalakítás primitív int-re
                .sum();                      // Összegzés

        Optional<Integer> min = nums.stream().reduce((a, b) -> b > a ? b : a);
        System.out.println(min.get());

        nums.stream().mapToInt(Integer::intValue).min();

        // Alternatív (elegánsabb) megoldás:
        int max = nums.stream()
                .max(Integer::compareTo)
                .orElse(0); // Ha üres, 0-t ad vissza

        List<Integer> szamok = new ArrayList<>();
        szamok.add(10);
        szamok.add(null);
        szamok.add(30);

        // A "biztonságos" adatfolyam
        int ossz = szamok.stream()
                .filter(Objects::nonNull)    // 1. ELTÁVOLÍTÁS: Itt szűrjük ki a null-okat
                .mapToInt(Integer::intValue) // 2. KONVERZIÓ: Itt alakítjuk át primitív int-re
                .sum();                      // 3. SZÁMÍTÁS: Itt végezzük a műveletet

        System.out.println("Az összeg: " + ossz);

        //        Adott egy List<String>.
        //
        //        Szűrd ki azokat a szavakat, amelyek hossza > 3
        //        Alakítsd nagybetűssé
        //        Gyűjtsd listába
        //
        List<String> szavak1 = List.of("apple", "banana", "pear", "strawberry", "almond");
        szavak1.stream().filter(szo->szo.length()>3).map(String::toUpperCase).collect(Collectors.toList());

        List<Integer> nums2 = List.of(1,2,3,1,2,5,6,3);
        System.out.println("---------------------------------");
        nums2.stream().distinct().forEach(System.out::println);

        List<String> words2 = List.of("apple", "cat", "banana", "dog", "car", "apricot");

        //        Feladat:
        //        Csoportosítsd a szavakat hossz szerint (Map<Integer, List<String>>).
        words2.stream().collect(Collectors.groupingBy(String::length)).forEach((k,v)-> System.out.println(k + " : " + v));

        //        Feladat:
        //        Számold meg, hogy melyik szó hányszor szerepel (Map<String, Long>).

        List<String> words3 = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        words3.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).forEach((k,v)-> System.out.println(k + " : " + v));

        //        Add vissza a 3 legnagyobb számot.
        List<Integer> numbers = List.of(5, 12, 7, 3, 20, 15, 9);
        numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        numbers.stream()
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(3)
                .forEach(System.out::println);


        //Szűrd ki a 18 év felettieket
        //Térj vissza a nevükkel (List<String>)
        class Person {
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        List<Person> people = List.of(
                new Person("Anna", 17),
                new Person("Bela", 22),
                new Person("Cecil", 30),
                new Person("Dani", 15)
        );

        people.stream().filter(p -> p.age >= 18).map(p -> p.name).forEach(System.out::println);

        people.stream()
                .sorted(Comparator.comparing(p -> p.name))
                .forEach(System.out::println);
        //Comparator.comparing(...) arra való, hogy egy objektum egy mezője alapján rendezz.

        //Találd meg a leggyakrabban előforduló elemet.
        List<String> words4 = List.of("a", "b", "a", "c", "b", "a", "d");
        words4.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(1)
                .forEach(System.out::println);
        Map<String, Long> gyakorisag = words.stream()
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.reducing(0L, e -> 1L, Long::sum)
                ));

        
    }
}

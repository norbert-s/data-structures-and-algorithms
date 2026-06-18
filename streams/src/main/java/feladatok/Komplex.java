package feladatok;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Komplex {
    public static void main(String[] args) {
        List<String> words = List.of(
                "apple", "banana", "apple", "car", "banana", "dog", "elephant"
        );
        //        Feladat
        //        Csak a 3 karakternél hosszabb szavak
        //        Számold meg az előfordulásokat
        //        Rendezd csökkenő sorrendbe gyakoriság szerint
        //        Add vissza List<String> formában (csak a szavak)
        words.stream().filter(s -> s.length() > 3).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
//                .map(e -> e.getKey())
                .forEach(System.out::println);

        class Person {
            String name;
            int age;
            String city;

            public Person(String name, int age, String city) {
                this.name = name;
                this.age = age;
                this.city = city;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", city='" + city + '\'' +
                        '}';
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public String getCity() {
                return city;
            }
        }
        //        feladat
        //        Csak 18+ emberek
        //        Város szerint csoportosítás
        //        Minden városban a legidősebb ember neve

        List<Person> people = List.of(
                new Person("Anna", 25, "Budapest"),
                new Person("Bela", 17, "Szeged"),
                new Person("Cecil", 30, "Budapest"),
                new Person("Dani", 40, "Szeged"),
                new Person("Eva", 20, "Budapest")
        );

        people.stream().filter(p->p.age>18)
                .collect(Collectors.groupingBy(p->p.city))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue().stream().max((a, b) -> Integer.compare(a.age, b.age)).orElseThrow().name
                )).forEach((k,v)-> System.out.println(k + " : " + v));

        Map<String, String> oldestByCity = people.stream()
                .filter(p -> p.getAge() >= 18)
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Person::getAge)),
                                opt -> opt.map(Person::getName).orElse(null)
                        )
                ));

        List<String> sentences = List.of(
                "hello world",
                "java streams are powerful",
                "hello java"
        );
        // ezzel mia gond ?
        System.out.println("---------------------");
        sentences.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getKey().length(), a.getKey().length()))
                .limit(2)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        // flatmap
        List<List<String>> orders = List.of(
                List.of("alma", "körte"),
                List.of("tej", "kenyér", "vaj"),
                List.of("tojás")
        );

        orders.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);
        System.out.println("---------------------------");
        List.of(1,2,3).stream().flatMap(s-> Stream.of(s*s)).forEach(System.out::println);

        List.of("abc", "de").stream().flatMap(s->Arrays.stream(s.split(""))).forEach(System.out::println);

        List.of(List.of(1,2,3),List.of(4,5,6)).stream().flatMap(s->s.stream()).forEach(System.out::println);

        List.of("hello world", "java").stream().flatMap(s->Arrays.stream(s.split(""))).forEach(System.out::println);

        Map.of("A osztály", List.of("Anna","Béla"), "B osztály", List.of("Csaba","Dóra")).entrySet().stream().flatMap(s->s.getValue().stream()).forEach(System.out::println);

        "hello".chars();  // IntStream: [104, 101, 108, 108, 111]

        "hello".chars()
                .mapToObj(c -> (char) c)        // IntStream -> Stream<Character>
                .forEach(System.out::println);  // h, e, l, l, o

        String result = "hello".chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("join: "+result);

        "hello".chars()
                .mapToObj(c -> (char) c)
                .map(Character::toUpperCase)
                .forEach(System.out::println);  // H, E, L, L, O

        "hello".chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(String::toUpperCase)
                .collect(toList());  // ["H", "E", "L", "L", "O"]
        people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.minBy(
                                Comparator.comparing(Person::getAge)
                        )
                ))
                .forEach((city, person) ->
                        person.ifPresent(System.out::println)
                );
        // személyek neveinek listája
        Map<String,List<String>> result2 =
                people.stream()
                        .filter(p -> p.getAge() > 30)
                        .collect(Collectors.groupingBy(
                                Person::getCity,
                                Collectors.mapping(
                                        Person::getName,
                                        Collectors.toList()
                                )
                        ));

    }
}

package modern_java.review_may_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercises {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 56);
        Optional<Integer> sum = list.stream().reduce((a1, a2) -> a1 + a2);
        if (sum.isPresent()) {
            System.out.println(sum.get());
        }

        List<String> list2 = List.of("apple", "korte", "borso");
        List<String> list3 = list2.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());

        List<String> words = List.of("apple", "pear", "pea");
        List<Integer> wordsLength = words.stream()
                .map(String::length).collect(Collectors.toList());

        List<Integer> szamSor = Arrays.asList(1, 2, 3, 4, 5, 56, 5, 3, 2, 5);


        List<String> wordsGroup = List.of("apple", "pear", "bean", "banana");
        Map<Character,List<String>>groupByFirstLetter= wordsGroup.stream()
                .collect(Collectors.groupingBy(x->x.charAt(0)));
        System.out.println(groupByFirstLetter);

        String text = "hello world";

        Map<Character, Long> frequency = text.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(frequency);

        List<String> wordsOsszefuzese = List.of("elephant","mosquito","grand final");
        String str1= String.join(",", wordsOsszefuzese);
        String str2 = wordsOsszefuzese.stream()
                .collect(Collectors.joining(","));
        System.out.println(str2);

        List<String> words2 = List.of("apple", "banana", "apple", "banana", "cherry", "apple");

        Map.Entry<String, Long> mostFrequent = words2.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println("most frequent word: " + mostFrequent);
    }
}

package modern_java.review_may_2024;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Uppercase {
    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!
        String text = "LowerCaseAndUpperCaseLetters";

        //my solutions
        String str = text.chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isUpperCase)
                .map(String::valueOf)
//                .reduce("", (a, b) -> (a + b));
        .collect(Collectors.joining());

        System.out.println(str);

        String str2 = Arrays.stream(text.split(""))
                .filter(x -> Character.isUpperCase(x.charAt(0)))
                .reduce("", (a, b) -> a + b);
        System.out.println(str2);


    }
}

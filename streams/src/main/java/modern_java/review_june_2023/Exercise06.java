package modern_java.review_june_2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise06 {
    //Write a Stream Expression to find the uppercase characters in a string!
    public static void main(String[]args){
        String str = "BrIaN TrAcY";
        String newStr = str.chars()
                .mapToObj(i->(char) i)
                .filter(i->!Character.isLowerCase(i))
                .map(i->String.valueOf(i))
                .collect(Collectors.joining());
        System.out.println(newStr);
    }
}

package modern_java.review.review_0213;

import modern_java.util.Util;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Review4 {
    public static void main(String[]args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        Map<String,List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(s->{
                    if(s%2==0)return "even";
                    else return "odd";
                }));
        Util.printOutGeneric(map);

    }
}

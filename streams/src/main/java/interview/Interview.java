package interview;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {
//        String message = " Processing trade with ISIN: US92840H2022 for Account: 713781.  ";
//        Arrays.stream(message.split(" ")).filter(s->s.matches("[^A-Za-z]")).collect(Collectors.toList()).get(0);
//        TreeMap<Integer,String> val = new TreeMap<>();
//        val.put(1,"sth1");
//        val.put(2,"sth1");
//        val.forEach((a,b)-> System.out.println(a+" "+b));

        List<String> input = Arrays.asList("Chrome", "Firefox", "Chrome", "Edge", "Firefox");
        input.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().stream().filter(s->s.getValue()>1).map(s->s.getKey()).forEach(System.out::println);

//        public class FinallyTest {
//            public static int getValue() {
//                try {
//                    return 10;
//                } finally {
//                    return 20;
//                }
//            }
//
//            public static void main(String[] args) {
//                System.out.println(getValue());
//            }
//        }
    }
}

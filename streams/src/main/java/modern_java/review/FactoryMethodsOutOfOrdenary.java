package modern_java.review;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodsOutOfOrdenary {
    public static void main(String[]args){
        List<String> list = new ArrayList<>(List.of("adam","eve","peter"));
        list.add("james");
        list.set(0,"boris");
        System.out.println(list);
    }
}

package modern_java.util;

import java.util.List;
import java.util.Map;

public class Util {
    public static <T,U> void printOutGeneric(Map<T,U> map){
        map.forEach((k,v)-> System.out.println(k+" ,"+v));
        printOutBorder();
    }
    public static <T> void printOutGeneric(List<T> list){
        list.forEach(System.out::println);
        printOutBorder();
    }

    public static <T> void printOutGeneric(T elem){
        System.out.println(elem.toString());
        printOutBorder();
    }
    public static void printOutBorder(){
        System.out.println("----------------------");
    }
//    public static <T,U> void printOutMapWithBorder(Map<T,U> map){
//
//        map.forEach((k,v)-> System.out.println(k+" ,"+v));
//        printOutBorder();
//    }


}

package modern_java.review_may_2024;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.util.Util;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;

public class Menu {
    public static void main(String[]args){
        List<Dish> menu = DishFactory.createDishes();
        Optional<Integer> sumDish= menu.stream()
                .map(x->1)
                .reduce(Integer::sum);
        System.out.println(sumDish);

        Optional<Dish> mostCalorieDish =
                menu.stream()
                        .max(new Comparator<Dish>() {
                            @Override
                            public int compare(Dish o1, Dish o2) {
                                return o1.getCalories() - o2.getCalories();
                            }
                        });
        if(mostCalorieDish.isPresent()){
            System.out.println(mostCalorieDish);
        }

        List<Dish> caloryLargerThan500 = menu.stream()
                .filter(x->x.getCalories()>500)
                .collect(Collectors.toList());

        //group by type the kind of dishes that has a calory more than 500
        Map<Dish.Type,List<Dish>> myDishes =    menu.stream()
                .filter(x->x.getCalories()>500)
                .collect(Collectors.groupingBy(x->x.getType()));
        Util.printOutGeneric(myDishes);


        //group dishes by caloric level
        Map<CaloricLevel,List<Dish>> byCaloricLevel = menu.stream()
                .collect(Collectors.groupingBy(x->{
                    if(x.getCalories()<500)return CaloricLevel.Diet;
                    else if(x.getCalories()>=500&&x.getCalories()<800)return CaloricLevel.Normal;
                    else return CaloricLevel.Fatty;

                }));
        Util.printOutGeneric(byCaloricLevel);


        Myfunc myfunc =()->System.out.println("hi");
        myfunc.dosmg();

        Predicate<String> myPred = (s)->s.length()>=5;
        System.out.println(myPred.test("halo"));

        List<String> myStr = Arrays.asList("apple","monkey","ball");
        myStr.stream()
                .filter(myPred)
                .forEach(System.out::println);

        Function<Integer,Integer> myF =(x) ->{
            return (x+5);
        };
    }

}

enum CaloricLevel{
    Diet,Fatty,Normal
}
package modern_java.example.streams;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.List;
import java.util.Optional;






public class Reduce {
    public static void main(String args[]){
        List<Integer>numbers = List.of(1,2,3,4,5,6,7,8);
        // int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        // System.out.println(sum);

        // int sum2 = numbers.stream().reduce(0, Integer::sum);

        Optional<Integer> sum3 = numbers.stream().reduce((a, b) -> (a + b));
        if(sum3.isPresent()){
            System.out.println(sum3.get());
        }

        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        List<Dish> dishList = DishFactory.createDishes();
        int sumCalories = dishList.stream()
            .map(x->x.getCalories()).reduce(0,(x,y)->x+y);
        System.out.println(sumCalories);

        int numberOfDishes = dishList.stream()
            .map(x->1).reduce(0,(x,y)->x+y);
        System.out.println(numberOfDishes);
    }
}

package modern_java.example.streams;
import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summingInt;

public class ReducingAndSummarizing {
    public static void main(String[]args) {
        List<Dish> menu = DishFactory.createDishes();
        Comparator<Dish> dishCaloriesComparator =
                Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish =
                menu.stream()
                        .collect(maxBy(dishCaloriesComparator));
        System.out.println(mostCalorieDish.get());
        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println(totalCalories);

    }
}

package modern_java.review_feb_2024;

import modern_java.example.Dish.Dish;
import modern_java.example.Dish.DishFactory;
import modern_java.example.traders.TransactionFactory;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static java.awt.SystemColor.menu;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summingInt;
import static modern_java.example.Dish.DishFactory.createDishes;

public class Collecting {
    public static void main(String[] args) {
        //highest calorie dish
        Optional<Integer> maxValDish = createDishes().stream()
                .map(s->s.getCalories())
                .max(Integer::max);
        Optional<Integer> maxValDish2 = createDishes().stream()
                .map(s->s.getCalories())
                .max(Comparator.naturalOrder());

        Optional<Integer> maxVal = createDishes().stream()
                .map(Dish::getCalories)
                .collect(maxBy(Integer::max));

         createDishes().stream()
                .map(s->s.getCalories())
                .collect(maxBy(Integer::max));

        Comparator<Dish> dishCaloriesComparator =
                Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish =
                createDishes().stream()
                        .collect(maxBy(dishCaloriesComparator));

        Optional<Dish> mostCalorieDish2 =
                createDishes().stream()
                        .max(dishCaloriesComparator);

        int totalCalories =  createDishes().stream().collect(Collectors.summingInt(Dish::getCalories));
        int totalCalories2 = createDishes().stream().mapToInt(Dish::getCalories).sum();

        String shortMenu = createDishes().stream().map(Dish::getName).collect(Collectors.joining(" "));

        int totalCalories3 = createDishes().stream().map(Dish::getCalories).reduce(0, (i, j) -> i + j);
        int totalCalories4 = createDishes().stream().collect(Collectors.reducing(
                0, Dish::getCalories, (i, j) -> i + j));

        int totalCalories5 = createDishes().stream().collect(Collectors.reducing(0,
                Dish::getCalories,
                Integer::sum));

        Optional<Integer> totalCalories6 = createDishes().stream().map(Dish::getCalories).reduce(Integer::sum);
        int totalCalories7 = createDishes().stream().mapToInt(Dish::getCalories).sum();

        String shortMenu2 = createDishes().stream().map(Dish::getName).collect( Collectors.reducing( (s1, s2) -> s1 + s2 ) ).get();
        String shortMenu3 = createDishes().stream() .collect( Collectors.reducing( "", Dish::getName, (s1, s2) -> s1 + s2 ) );

    }
}

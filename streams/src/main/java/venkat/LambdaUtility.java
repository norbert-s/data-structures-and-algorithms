package venkat;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class LambdaUtility {
    public static final Function<Person, String> byTheirName = person -> person.getName();

    public static final Function<Person, Integer> byAge = person -> person.getAge();


    //    static final Function<Person,Integer> byAgeDifference = (person,person2) -> person.ageDifference(person2);
    //
    //    static final BiFunction<Person,Person, Integer> byAgeDifference = (Person s1,Person s2)->s1.ageDifference(s2);

    //    static Comparator<Person> compareByAgeDifference = Comparator.comparing(byAgeDifference);
    static Comparator<Person> compareAscending = Comparator.comparing(Person::getName);
    static Comparator<Person> compareDescending = Comparator.comparing(byTheirName);
}

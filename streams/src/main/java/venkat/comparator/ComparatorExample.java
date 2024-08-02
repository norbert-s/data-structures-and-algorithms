package venkat.comparator;
import venkat.PeopleFactory;
import venkat.Person;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


import static modern_java.util.Util.*;

public class ComparatorExample {
    static final Function<Person, String> byTheirName = Person::getName;

    static final Function<Person, Integer> byAge = Person::getAge;
    static Comparator<Person> compareAscending = Comparator.comparing(Person::getName);
    static Comparator<Person> compareDescending = Comparator.comparing(byTheirName);

    public static void main(String [] args){
        final List<Person> people = PeopleFactory.createPeople();

        //unsupported operation exceptions
        //list.add(0, new Person(28,"anna"));
        //list.set(0,new Person(43,"carl"));
        printOutGeneric(orderByComparator(compareAscending,people));
        printOutGeneric(orderByComparator(compareDescending,people));
        printOutGeneric(orderByComparator((Person person1, Person person2)->person1.ageDifference(person2),people));

        people.stream()
                .max((p1,p2)->p1.ageDifference(p2))
                .ifPresent(eldest -> System.out.println("Eldest: " + eldest));
        people.stream()
                .sorted(Comparator.comparing((Person person) -> person.getAge()).thenComparing((Person person) -> person.getName()))
                .collect(Collectors.toList());
    }
    public static <T,U> List<U> orderByComparator(Comparator<T> comparator, List<U> list){
        return list.stream()
                .sorted((Comparator<? super U>) comparator)
                .collect(Collectors.toList());
    }

}

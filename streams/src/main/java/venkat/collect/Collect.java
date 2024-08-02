package venkat.collect;

import modern_java.util.Util;
import venkat.LambdaUtility;
import venkat.PeopleFactory;
import venkat.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;

import static java.util.stream.Collectors.*;
import static modern_java.util.Util.printOutGeneric;

public class Collect {
    static Comparator<Person> byAge = Comparator.comparing(Person::getAge);
    public static void main(String [] args){
        List<Person> people = PeopleFactory.createPeople();
        Map<Integer, List<Person>> map = people.stream()
                .collect(groupingBy(LambdaUtility.byAge,toList()));
        Util.printOutGeneric(map);

        Map<Integer, List<String>> nameOfPeopleByAge =
                people.stream()
                        .collect(
                                groupingBy(Person::getAge, mapping(Person::getName, toList())));
        Util.printOutGeneric(nameOfPeopleByAge);

        //let’s group the names by their first
        //character and then get the oldest person in each group
        //my solution
        Map<Character, List<Integer>> firstCharOfPeopleByAge = people.stream()
                .collect(
                        groupingBy((Person p1)->p1.getName().charAt(0),mapping(Person::getAge,toList())));
        Util.printOutGeneric(firstCharOfPeopleByAge);

        //book soution
        Map<Character, Optional<Person>> oldestPersonOfEachLetter =
                people.stream()
                        .collect(groupingBy(person -> person.getName().charAt(0),
                                reducing(BinaryOperator.maxBy(byAge))));
        System.out.println("Oldest person of each letter:");
        Util.printOutGeneric(oldestPersonOfEachLetter);


    }
}

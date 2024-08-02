package venkat;

import java.util.List;

public class PeopleFactory {
    public static List<Person> createPeople(){
        return List.of(
                new Person(28,"andrew"),
                new Person(34,"petra"),
                new Person(39,"bobby"),
                new Person(28,"dalma"),
                new Person(34,"agnes"),
                new Person(33,"jeff")
        );
    }
}

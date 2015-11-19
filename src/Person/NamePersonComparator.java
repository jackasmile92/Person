package Person;

import java.util.Comparator;
import Person.Person;

public class NamePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getName().compareTo(secondPerson.getName());
    }
    
}


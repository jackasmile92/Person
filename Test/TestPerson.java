import org.junit.Test;

import Person.*;
import Person.Dates;
public class TestPerson {
	
	

	@Test
	public void testPersonCreation() {
		java.util.Date date = Dates.createDate(2, 5, 1999);
		Person newPerson = new Person("Petya",date,1);
		System.out.println(newPerson.getName());
		System.out.println(newPerson.getBirthday());
		System.out.println(newPerson.getPassport());
		
		date = Dates.createDate(2, 5, 2000);
		Person anotherPerson = new Person("Vasya",date,2);
		System.out.println(newPerson.compareTo(anotherPerson));
		
		date = Dates.createDate(2, 5, 2000);
		Person thirdPerson = new Person("Ksenya",date,0);
		System.out.println(thirdPerson.compareTo(anotherPerson));
		
		
	}
	
	@Test
	public void testSorting(){
		Person[] arrayOfPerson = new Person[5];
        String[] arrayOfNames = {"Vasya", "Petya", "Ksenya", "Katya", "Timur"};
        for (int i = 0; i < 5; i++) {
            java.util.Date date = Dates.createDate(i+2, i+5, 1999 + i);
            int passport = i;
            arrayOfPerson[i] = new Person(arrayOfNames[i], date, passport);
        }
        Sorting.sortByAge(arrayOfPerson);
        Sorting.sortByName(arrayOfPerson);
	}

}

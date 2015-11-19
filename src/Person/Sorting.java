package Person;
import java.util.Arrays;

public class Sorting {
	
	public static void sortByAge(Person[] arrayOfPerson){
		 if(arrayOfPerson.length == 0){
			System.out.println("Array is empty"); 
		 } else {			 
			System.out.println("Sort by age:");
		        Arrays.sort(arrayOfPerson);
		        for (Person oneOfPerson : arrayOfPerson) {
		            System.out.println(oneOfPerson.getName().toString() + ". Age = " + oneOfPerson.calculateAge());
		        }
	     }
		
	}
	
	public static void sortByName(Person[] arrayOfPerson){
		 if(arrayOfPerson.length == 0){
			System.out.println("Array is empty"); 
		 } else {	
			System.out.println("Sort by name:");
	        Arrays.sort(arrayOfPerson, new NamePersonComparator());
	        for (Person numberPerson : arrayOfPerson) {
	            System.out.println(numberPerson.getName().toString());
	        }
		 }
	}
	
}

/**
 * 
 */
package PERSON;

/**
* @author CamilleDayao
 **@Description : To simulates the creation and display of Person objects
 **@DateCreated : 24/05/2022
 */
public class Person {

	private String first;
	private String last;
	private static int printCounter = 0;
	
	public Person () {			// initialization with 0 parameter
		first = "John";
		last = "Doe";
	}
	public Person(String first, String last) {		 // initialization with 2 parameter
		this.first = first;
		this.last = last;
	}
	public String setFirst(String first) {			//method to get the given first name
		this.first = first;
		return first;
		
	}
	public String setLast(String last) {			//method to get the given last name
		this.last = last;
		return last;
	}
	public String printFullName () {				//getter to print all the full name
		System.out.println(first + " " + last);
		printCounter++;								// counter how many print method has been simulated
		return first + last;
	
	}
	
	public static int getNumOfPeople() {			// method to get the total number of people
		return printCounter -1;						// counter minus 1 since the first print is not counted
	}
	
	}
	



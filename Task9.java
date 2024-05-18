/* Write two methods: 
1-calculateAge(yearBirth); and returns the age
2-yearsUntilRetirement(name,year); and displays in the console following: “Mike retires
in 36 years”
Example: yearsUntilRetirement(“Mike”,1990); */



package Day_14_Methods_Cont;

public class Task9 {

	public static void main(String[] args) {

		yearsUntilRetirement("mike",2015);
	}

	  public static int calculateAge(int yearBirth) {
		  
	        int currentYear = java.time.Year.now().getValue();
	        return currentYear - yearBirth;
			
	}
	public static void yearsUntilRetirement(String name, int birthYear ) {
		int retirementAge = 65;
		int age = calculateAge(birthYear);
		int yearsLeft = retirementAge - age;

        System.out.println(name + " retires in " + yearsLeft + " years");
		
		
	}

}


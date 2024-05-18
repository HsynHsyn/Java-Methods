/*The distance a vehicle travels can be calculated as follows:
Distance = Speed * Time
Write a method named distance that accepts a vehicle’s speed and time as arguments,
and return the distance the vehicle has traveled. */


package Day_14_Methods_Cont;

public class Task7 {

	public static void main(String[] args) {

		double totalTraveled=distance(50,4); //  Also, you can equal the metod anything Ex; double test=distance(50,4);. every return value is the same (follow suit)
		
		System.out.println(totalTraveled);
		
		if (totalTraveled>500) {
			System.out.println("you spend much more gas");
		}else {
			System.out.println("your spend is avarage");
		}
		
	}

	public static double distance(double speed, double time) {
		
		double totalTraveled = speed*time;
		return totalTraveled;				// we can not anything after return because the program does not go after return and it goes to main method
		
	}

}

/*Write a method that accepts 2 numbers and return if they have the same last digit.
Sample Output
lastDigit(7,17) - >true
lastDigit(6,17) - >false
lastDigit(3,113) - >true	*/


package Day_14_Methods_Cont;

public class Task8 {

	public static void main(String[] args) {
		
		boolean result= lastDigit(7,17);
		boolean result1= lastDigit(6,17);
		boolean result2= lastDigit(3,113);
		
		System.out.println(result );
		System.out.println(result1 );
		System.out.println(result2 );
		
		// second solution
		
		/*if (lastDigit(7,17)) {
			System.out.println("They have same last digit");
		}else {
			System.out.println("They do not same last digit");*/

		}
		
	

	public static boolean lastDigit(int num1, int num2) {
		
		if ((num1-num2)%2==0) {
			return true;
		}else {
			return false;
		}
		
	}

}

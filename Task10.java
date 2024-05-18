/* A prime number is a number that is evenly divisible only by itself and 1. For example,
the number 5 is prime number because it can be evenly divided only by 1 and 5. The
number 6, however, is not prime number because it can be divided evenly by 1,2,3,and 6. 
-Write a method named isPrime which takes an integer as an argument and returns true if
the argument is a prime number, or false otherwise.
- Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all
the other even numbers can be divided by 2. */


	package Day_14_Methods_Cont;

	public class Task10 {
		
		public static void main(String[] args) {
			
        int num = 17; // Choose a number for testing.
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
	}
	 public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; //0 and 1 are not prime numbers.
	        }
	        if (number == 2) {
	            return true; // 2 is the only even prime number.
	        }
	        if (number % 2 == 0) {
	            return false; // Other even numbers are not prime.
	        }
	        //  We only check odd divisors.
	        for (int i = 3; i <= number; i ++) {
	            if (number % i == 0) {
	                return false; // If the number has divisors, it's not prime.
	            }
	        }
	        return true; // If no divisors found, it's prime.
	    }

	    
	    }
	

package Day_14_Methods_Cont;

public class Task3 {

	public static void main(String[] args) {

		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		specialEleven(25);

	}

	public static void specialEleven(int number) {
		
		if (number%11==0) {
			System.out.println("true");
		}else if (number%11==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}

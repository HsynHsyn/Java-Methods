package Day_14_Methods_Cont;

public class Task1 {

	public static void main(String[] args) {

		stringTimes("Hi", 1);
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);


		
	}

	public static void stringTimes(String string, int number) {
		
		String str = "";
		
		for (int i=0;i<number; i++) {
			
			str = str + string;
			
				
	/*	if (y==1) {
			
			System.out.print("Hi"+"\n");
		}else if(y==2) {
			System.out.print("HiHi"+"\n");  not effective way

		}else if (y==3){
			System.out.print("HiHiHi"+"\n");
			
		}else {
			System.out.println("please check again");*/

		}
		
		System.out.println(str);

	}

}

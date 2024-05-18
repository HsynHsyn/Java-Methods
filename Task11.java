/*Create a method called displayHighScorePosition. It should have a players name as a
parameter, and a 2nd parameter as a position in the high score table. You should
display the players name along with a message like “managed to get into position”
and the position they got and a further message “on the high score table”
§ Create a 2nd method called calculateHighScorePosition. It should be sent one
argument only., the player score. It should return an int. The return data should be :
1 – if the score is >=1000
2 – if the core is >=500 and <1000
3- if the score is >=100 and <500
4- in all other cases
Call both methods and display the results of the following:
a score of 1500, 900, 400 and 50 */



package Day_14_Methods_Cont;

public class Task11 {

	public static void main(String[] args) {
		
		int playerScore1=1500;
		int playerScore2=900;
		int playerScore3=400;
		int playerScore4=50;
		
		int position1= calculateHighScorePosition(playerScore1);
		displayHighScorePosition("Alice", position1);
		 System.out.println(calculateHighScorePosition(playerScore1));
		 System.out.println("*************************");
		 
		int position2= calculateHighScorePosition(playerScore2);
		displayHighScorePosition("Bob", position2);
		 System.out.println("*************************");
		 
		int position3= calculateHighScorePosition(playerScore3);
		displayHighScorePosition("Jack", position3);
		 System.out.println("*************************");
		 
		int position4= calculateHighScorePosition(playerScore4);
		displayHighScorePosition("Marta", position4);
	}
	
	public static void displayHighScorePosition (String playerName, int position) {
		System.out.println(playerName + " maneged to get into position .");
		System.out.println("Position: "+ position+ " on the high score table");
		
	}
	public static int calculateHighScorePosition(int playerScore) {
		
		if (playerScore>=1000) {
			return 1; // 1,2,3,4 are the rank which we assigned.
			
		}else if (playerScore>=500 && playerScore <1000) {
			
			return 2;
						
		} else if (playerScore>=100 && playerScore <500) {
			
			return 3;
		}else {
			return 4;
		}
	}


}
